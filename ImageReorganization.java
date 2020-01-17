
import javax.imageio.ImageIO;

import java.awt.*;

import java.awt.image.BufferedImage;

import java.io.File;

 

/**
 */

public class ImageReorganization {

    public ImageReorganization(String id, String name1) {

        String backgroundPath = "/home/pictures/"+id+".jpg";

        String outPutPath="/home/edit/999.jpg";

        overlapImage(backgroundPath,name1,outPutPath);

    }

    public static boolean isNumeric(String str){
    	for (int i = str.length();--i>=0;){  
    		if (!Character.isDigit(str.charAt(i))){
    			return false;
    	    }
    	}
    	return true;
    }
    
    public static boolean isEnglish(String charaString){

        return charaString.matches("^[a-zA-Z]*");

    }

    public static String overlapImage(String backgroundPath,String name,String outPutPath){

        try {

            //设置图片大小

//            BufferedImage background = resizeImage(618,1000, ImageIO.read(new File("这里是背景图片的路径！")));

            BufferedImage background = resizeImage(850,1280, ImageIO.read(new File(backgroundPath)));


            //在背景图片中添加入需要写入的信息，例如：扫描下方二维码，欢迎大家添加我的淘宝返利机器人，居家必备，省钱购物专属小秘书！

            //String message = "扫描下方二维码，欢迎大家添加我的淘宝返利机器人，居家必备，省钱购物专属小秘书！";

            Graphics2D g = background.createGraphics();

            g.setColor(Color.darkGray);

            g.setFont(new Font("微软雅黑",Font.BOLD,42));
            
            if (!isNumeric(name) && !isEnglish(name)) {
            	if (name.length() == 2) {
            		g.drawString(name,380 ,255);
            	}else if (name.length() == 1) {
            		g.drawString(name,400 ,255);
            	}else if (name.length() == 3) {
            		g.drawString(name,360 ,255);
            	}else {
            		g.drawString(name,340 ,255);
            	}
            }else {
            	if (name.length() == 2) {
            		g.drawString(name,405 ,255);
            	}else if (name.length() == 1) {
            		g.drawString(name,420 ,255);
            	}else if (name.length() == 3) {
            		g.drawString(name,385 ,255);
            	}else {
            		g.drawString(name,380 ,255);
            	}
            }
            g.dispose();

//            ImageIO.write(background, "jpg", new File("这里是一个输出图片的路径"));

            ImageIO.write(background, "jpg", new File(outPutPath));

        }catch (Exception e){

            e.printStackTrace();

        }

        return null;

    }

 

    public static BufferedImage resizeImage(int x, int y, BufferedImage bfi){

        BufferedImage bufferedImage = new BufferedImage(x, y, BufferedImage.TYPE_INT_RGB);

        bufferedImage.getGraphics().drawImage(

                bfi.getScaledInstance(x, y, Image.SCALE_SMOOTH), 0, 0, null);

        return bufferedImage;

    }

}
