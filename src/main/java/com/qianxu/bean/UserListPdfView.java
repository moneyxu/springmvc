package com.qianxu.bean;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Cell;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Phrase;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.BaseFont;
import com.qianxu.entity.PdfUser;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.List;
import java.util.Map;

public class UserListPdfView extends AbstractPdfView {

    @Override
    @SuppressWarnings("unchecked")
    protected void buildPdfDocument(Map<String, Object> model, com.lowagie.text.Document document,
            com.lowagie.text.pdf.PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setHeader("Content-Disposition", "inline;filename=" + new String("用户列表.pdf".getBytes(), "iso8859-1"));
        List<PdfUser> list = (List<PdfUser>) model.get("userList");
        Table table = new Table(3);
        table.setWidth(80);
        table.setBorder(1);
        table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
        BaseFont baseFont = BaseFont.createFont();
        Font font = new Font(baseFont, 12, Font.NORMAL, Color.BLACK);
        table.addCell(buildCell("username", font));
        table.addCell(buildCell("age", font));
        table.addCell(buildCell("registerTime", font));
        for (int i = 0; i < list.size(); i++) {
            PdfUser user = list.get(i);
            table.addCell(buildCell(user.getName(), font));
            table.addCell(buildCell(user.getAge() + "", font));
            String date = DateFormatUtils.format(user.getRegisterTime(), "yyyy-MM-dd");
            table.addCell(buildCell(date, font));
        }
        document.add(table);
    }

    private Cell buildCell(String content, Font font) throws BadElementException{
        Phrase phrase = new Phrase(content, font);
        return new Cell(phrase);
    }
}
