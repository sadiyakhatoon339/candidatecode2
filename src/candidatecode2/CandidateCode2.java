/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidatecode2;

/**
 *
 * @author DELL
 */
import java.io.*;
import java.util.*;
public class CandidateCode2 {
   public static void main(String args[] ) throws Exception {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int a[][]=new int[1000][1000];
      StringTokenizer tk=new StringTokenizer(br.readLine());
      int r=Integer.parseInt(tk.nextToken());
      int c=Integer.parseInt(tk.nextToken());
      int d=0,k=0,f=0;
      int b[]=new int[100];
      for(int i=0;i<r;i++)
      {
         StringTokenizer tr=new StringTokenizer(br.readLine());
         for(int j=0;j<c;j++)
         {
            a[i][j]=Integer.parseInt(tr.nextToken());
         }
      }

             

       for(int i=0;i<r;i++)
      {
         for(int j=0;j<c;j++)
         {
             
              if(a[i][j]==1 )
              {
               if(a[i][j+1]==1 && a[i+1][j]==1)
               {
              d=d+2;
              }
               else if(a[i][j+1]==1 && j<=c-1)
              {
                 
                  d++;
                  
              }
              
              else if(a[i][j+1]==0 &&a[i+1][j]==1)
              {
              d++;
              i=i+1;
              break;
              }
              
              else if(a[i][j-1]==1 && a[i+1][j]==1)
              {
              d=d+2;
              }
              else if(a[i][j-1]==1)
              {
              d++;
             j--;
              }
              else f=1;
              }
               else  if(j==c-1 && i==r-1)     
              {
               b[k]=d+1;
                d=0;
                k++;
         }
         else
                   {
               b[k]=d+1;
                d=0;
                k++;
         }
                   }}
         
           
         
       int max=b[0];
         for(int t=0;t<k;t++)
         {
            
            if(b[k]>max)
            max=k;
         }
            System.out.println(max);
            
         }}

