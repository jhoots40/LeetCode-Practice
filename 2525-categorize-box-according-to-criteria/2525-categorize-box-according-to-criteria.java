class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;
        boolean heavy = false;
        
        if(length >= Math.pow(10, 4) || width >= Math.pow(10, 4) ||
           height >= Math.pow(10, 4) || mass >= Math.pow(10, 4))
        {
            bulky = true;
        }
        
        long volume = (long)length * (long)width * (long)height;
        if(volume >= Math.pow(10, 9)) bulky = true;
        
        if(mass >= 100) heavy = true;
        
        if     ( bulky && heavy ) return "Both";
        else if(!bulky && !heavy) return "Neither";
        else if( bulky && !heavy) return "Bulky";
        else if(!bulky &&  heavy) return "Heavy";
        
        return "error";
    }
}