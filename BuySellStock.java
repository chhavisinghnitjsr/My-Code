import java.util.*;
import java.io.*;
import java.lang.*;
class BuySellStock{
    public static int maxProfit(int prices[],int start,int end,int n){
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            for(int j =i+1; j<n; j++){
               int  curr_profit = prices[j] - prices[i];
                if(curr_profit > maxProfit){
                    maxProfit = curr_profit + maxProfit(prices,0,n-1,n);
                }
            }
        }
        System.out.println(maxProfit);
        return 0;
    }
    public static void main(String[] args){
        int prices [] = {100, 180, 260, 310,40, 535, 695};
        int n = prices.length;
        BuySellStock obj = new BuySellStock();
        obj.maxProfit(prices,n);
    }
}