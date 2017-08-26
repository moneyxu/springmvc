package com.qianxu.bean;

import com.qianxu.entity.ExcelUser;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class UserListExcelView extends AbstractXlsView {

    @Override
    @SuppressWarnings(value = "unchecked")
    protected void buildExcelDocument(Map<String, Object> model, org.apache.poi.ss.usermodel.Workbook workbook,
            HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setHeader("Content-Disposition", "inline;filename=" + new String("用户列表.xls".getBytes(), "iso8859-1"));
        List<ExcelUser> list = (List<ExcelUser>) model.get("userList");
        Sheet sheet = workbook.createSheet("users");
        Row head = sheet.createRow(0);
        head.createCell(0).setCellValue("用户名");
        head.createCell(1).setCellValue("年龄");
        head.createCell(2).setCellValue("注册时间");
        for (int i = 0; i < list.size(); i++) {
            ExcelUser user = list.get(i);
            Row row = sheet.createRow(i + 1);
            row.createCell(0).setCellValue(user.getName());
            row.createCell(1).setCellValue(user.getAge());
            String date = DateFormatUtils.format(user.getRegisterTime(), "yyyy-MM-dd");
            row.createCell(2).setCellValue(date);
        }
    }
}
