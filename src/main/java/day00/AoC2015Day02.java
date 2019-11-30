package day00;

public class AoC2015Day02 {

    public static int calculateWrappingPaperSize(String in) {
        String input = in;
        String[] inputArray = input.split("\n");
        int totalPaperSize = 0;

        for(String i : inputArray) {
        totalPaperSize += calculateIndividualPresent(i);
        }
        return totalPaperSize;
    }

    static int calculateIndividualPresent(String in) {
        int length = 0;
        int width = 0;
        int height = 0;

        // 2x3x4
        String[] individualPresentSizes = in.split("x");
        length = Integer.valueOf(individualPresentSizes[0]);
        width = Integer.valueOf(individualPresentSizes[1]);
        height = Integer.valueOf(individualPresentSizes[2]);

        int lengthwidth = length * width;
        int widthheight = width * height;
        int heigthlength = height * length;

        int minValue = Math.min(heigthlength, Math.min(lengthwidth,widthheight));

        int individualPresentSize = (2*lengthwidth) + (2*widthheight) + (2*heigthlength) + minValue;

        return individualPresentSize;

    }

    public static int calculateRibbonTotal(String in) {
        String input = in;
        String[] inputArray = input.split("\n");
        int totalRibbonLength = 0;

        for(String i : inputArray) {
            totalRibbonLength += calculateIndividualRibbon(i);
        }
        return totalRibbonLength;
    }
    static int calculateIndividualRibbon(String in) {
        int length = 0;
        int width = 0;
        int height = 0;

        // 2x3x4
        String[] individualPresentSizes = in.split("x");
        length = Integer.valueOf(individualPresentSizes[0]);
        width = Integer.valueOf(individualPresentSizes[1]);
        height = Integer.valueOf(individualPresentSizes[2]);

        int maxValue = Math.max(length, Math.max(width, height));
        int areaWrap = 0;
/*

        if (length < maxValue) {
            if (width < maxValue) {
                areaWrap = length * width;
            }
            if (height < maxValue) {
                areaWrap = length * height;
            }
        } else areaWrap = width * height;
*/
        if (length < width) {
            if (height < width) {
                areaWrap = 2*(length + height);  //width is biggest
            } else {
                areaWrap = 2*(length + width); //heigth is biggest
            }
        } else {
            if (length < height) {  //height is biggest
                areaWrap = 2*(length + width);
            } else {
                areaWrap = 2*(width + height); //length is biggest
            }
        }


        int cubicVolume = length * width * height;
        int individualRibbonSize = areaWrap + cubicVolume;

        return individualRibbonSize;
    }

}
