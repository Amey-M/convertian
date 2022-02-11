package com.ctrl;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import java.io.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;

@Controller
public class fileuploadCtrl {
	@RequestMapping(path="imgtopdfprocess")
	public String fileupload(Model model,@RequestParam("file") CommonsMultipartFile file)
	{
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		Document document = new Document();
		String output = "D:\\New folder\\output.pdf";
		byte [] data=file.getBytes();
		
		try {
			  Image image = Image.getInstance(data);	
		      FileOutputStream fos = new FileOutputStream(output);
		      PdfWriter writer = PdfWriter.getInstance(document, fos);
		      writer.open();
		      document.open();
		      float scaler = ((document.getPageSize().getWidth() - document.leftMargin()
		               - document.rightMargin()) / image.getWidth()) * 100;
		      System.out.println(scaler);
		      image.scalePercent(scaler);
		     // Image.setFixedPosition(100, 250); 
		      //image.scaleToFit(1353.625f, 1915.55f);
		      image.setAbsolutePosition(0, 0);
		     // image.scaleAbsolute(826, 1100);
		      float documentWidth = document.getPageSize().getWidth() - document.leftMargin() - document.rightMargin();
		      float documentHeight = document.getPageSize().getHeight() - document.topMargin() - document.bottomMargin();
		      image.scaleToFit(documentWidth, documentHeight);
		      image.scaleToFit(PageSize.A4.getWidth(), PageSize.A4.getHeight());
		      float x = (PageSize.A4.getWidth() - image.getScaledWidth()) / 2;
		      float y = (PageSize.A4.getHeight() - image.getScaledHeight()) / 2;
		      image.setAbsolutePosition(x, y);
		      document.add(image);
		      document.close();
		      writer.close();
		    }
		    catch (Exception e) {
		      e.printStackTrace();
		    }
		
		return "filesuc";
	}
}