import java.applet.Applet;
import java.awt.Frame;
import java.awt.List;
import java.awt.*;
import java.net.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

//-------------------------------------------------------------------------------------------------------------------------------//
//   HOW TO COMPILE THIS PROGRAM                                     						                                        //
// copyleft mark b springer 1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009 ,2010,2011 				//
// copyleft deacons folly software, 21 deeacons folly road , north harwich , ma. , 02645               					//
//        Sun Sep 06 11:42:09 EDT 2009                                                                                      					 //
// 1 GO TO http://java.sun.com                                                                                                   					//
//                                                                                                                                                					//
// 2 DOWNLOAD THE JDK IT IS FREE  TOO                                                                       						//
//                                                                                                                                                //
// 3 AFTER YOU INSTALL THE JDK  TYPE        javac skim_mail_k.java                              //
//                                                                                                                                                //
// this will create skim_mail_k.class                                                                                              //
//                                                                                                                                                //
// 4 RUN  skim_mail_k.class ,   TYPE        java skim_mail_k                                                      //
//                                                                                                                                                //
//------------------------------------------------------------------------------------------------//

    class skim_mail_k
      {

//skim_mail_k skim_mail_k skim_mail_k skim_mail_k x2t skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k
//skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k skim_mail_k
//skim_mail_k skim_mail_k skim_mail_k xt xt xt xt xt xt xt tx

//-------------------------------------//
// start extract_equal_slash function  //
// give it 1 string                    //
// and the output appears in the lower //
//  window                             //
//-------------------------------------//

public static void extract_equal_slash(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;
              String full_sentence = "";
              String search_item  = "=/" ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

if((search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item )  ) 
       {
//-------------------------------------------//
//  remember where you found the start of it //
//  plus the beginning =/                    //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
         i_Start_Of_Find = start_of_end+item_length ;

//-------------------------------//
// no ....                       //
//-------------------------------//
if(i_Start_Of_Find<realend)
{
while( search_string.substring( i_Start_Of_Find , i_Start_Of_Find+1 ).equals( "." ) )
       ++i_Start_Of_Find;
}
//-------------------------------//
// and no slashes , either       //
//-------------------------------//
if(i_Start_Of_Find<realend)
{
while( search_string.substring( i_Start_Of_Find , i_Start_Of_Find+1 ).equals( "/" ) )
       ++i_Start_Of_Find;
}
//-------------------------------//
// now start looking for the end //
//-------------------------------//

         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+5)<= realend ) // enough string left to check ??
              {
if(  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" )
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "'"  )
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
               )

    {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();

//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+4 )).compareTo("http") != 0
&& (search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).compareTo("www" ) != 0
  ) full_sentence = skim_mail_k.BASE_URL + "/";

//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+4)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).equals("www") )
full_sentence = "http://";
}
//-------------------------------//
// we must add the find          //
//-------------------------------//
full_sentence =  full_sentence + search_string.substring( i_Start_Of_Find , i_End_Of_Find ) ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)

skim_mail_k.l_Output_list.addItem (full_sentence );

//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate( full_sentence );
            full_sentence = "";
                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------//
//end of extract_equal_slash function  //
//-------------------------------------//
//-------------------------------------//
// start extract_HREF="      function  //
// give it 1 string                    //
// and the output appears in the lower //
//  window                             //
//-------------------------------------//

public static void extract_HREF(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;
              String full_sentence = "";
              String search_item  = "HREF=\"" ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

if((search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item )   ) 
       {
//-------------------------------------------//
//  remember where you found the start of it //
//  plus the beginning HREF="                //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
         i_Start_Of_Find = start_of_end+item_length ;


//-------------------------------------------//
//  delete previous directory commands       //
//  ie.      ../                             //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
while ( (search_string.substring(  i_Start_Of_Find , i_Start_Of_Find+1 ) ).equals( "." )  )
                i_Start_Of_Find++ ;

//-------------------------------------------//
//  delete previous directory commands       //
//  ie.      ../                             //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
while ( (search_string.substring(  i_Start_Of_Find , i_Start_Of_Find+1 ) ).equals( "/" )  )
                i_Start_Of_Find++ ;

//----------------------------------------------//
//  start loop  to look for closing delimiter   //
//----------------------------------------------//
         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+1)<= realend ) // enough string left to check ??
              {
if(  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" ) 
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
               )

    {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();

//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+5)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+4 )).compareTo("http") != 0
&& (search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).compareTo("www" ) != 0
  ) full_sentence = skim_mail_k.BASE_URL + "/";
}
//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+4)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).equals("www") )
full_sentence = "http://";
}
//-------------------------------//
// we must add the find          //
//-------------------------------//
full_sentence =  full_sentence + search_string.substring( i_Start_Of_Find , i_End_Of_Find ) ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)

skim_mail_k.l_Output_list.addItem (full_sentence );

//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate( full_sentence );
            full_sentence = "";
                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------//
//end of      extract_HREF=" function  //
//-------------------------------------//
// start extract_src="       function  //
// give it 1 string                    //
// and the output appears in the lower //
//  window                             //
//-------------------------------------//

public static void extract_src(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;
              String full_sentence = "";
              String search_item  = "src=\"" ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

if((search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item )  ) 
       {
//-------------------------------------------//
//  remember where you found the start of it //
//  plus the beginning HREF="                //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
         i_Start_Of_Find = start_of_end+item_length ;


//-------------------------------------------//
//  delete previous directory commands       //
//  ie.      ../                             //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
while ( (search_string.substring(  i_Start_Of_Find , i_Start_Of_Find+1 ) ).equals( "." )  )
                i_Start_Of_Find++ ;

//-------------------------------------------//
//  delete previous directory commands       //
//  ie.      ../                             //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
while ( (search_string.substring(  i_Start_Of_Find , i_Start_Of_Find+1 ) ).equals( "/" )  )
                i_Start_Of_Find++ ;

//----------------------------------------------//
//  start loop  to look for closing delimiter   //
//----------------------------------------------//
         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+1)<= realend ) // enough string left to check ??
              {
if(  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" ) 
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
               )

    {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();

//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+5)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+4 )).compareTo("http") != 0
&& (search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).compareTo("www" ) != 0
  ) full_sentence = skim_mail_k.BASE_URL + "/";
}
//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+4)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).equals("www") )
full_sentence = "http://";
}
//-------------------------------//
// we must add the find          //
//-------------------------------//
full_sentence =  full_sentence + search_string.substring( i_Start_Of_Find , i_End_Of_Find ) ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)

skim_mail_k.l_Output_list.addItem (full_sentence );

//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate( full_sentence );
            full_sentence = "";
                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------//
//end of      extract_src="  function  //
//-------------------------------------//

//-------------------------------------//
// start extract_href        function  //
// give it 1 string                    //
// and the output appears in the lower //
//  window                             //
//-------------------------------------//
public static void extract_href(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;
              String full_sentence = "";
              String search_item  = "href=\"" ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

if((search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item ) ) 
       {
//-------------------------------------------//
//  remember where you found the start of it //
//  plus the beginning HREF="                //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
         i_Start_Of_Find = start_of_end+item_length ;


//-------------------------------------------//
//  delete previous directory commands       //
//  ie.      ../                             //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
while ( (search_string.substring(  i_Start_Of_Find , i_Start_Of_Find+1 ) ).equals( "." )  )
                i_Start_Of_Find++ ;

//-------------------------------------------//
//  delete previous directory commands       //
//  ie.      ../                             //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
while ( (search_string.substring(  i_Start_Of_Find , i_Start_Of_Find+1 ) ).equals( "/" )  )
                i_Start_Of_Find++ ;

//----------------------------------------------//
//  start loop  to look for closing delimiter   //
//----------------------------------------------//
         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+1)<= realend ) // enough string left to check ??
              {
if(  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" ) 
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
               )

    {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();

//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+4)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+4 )).compareTo("http") != 0
&& (search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).compareTo("www" ) != 0
  ) full_sentence = skim_mail_k.BASE_URL + "/";
}
//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+4)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).equals("www") )
full_sentence = "http://";
}
//-------------------------------//
// we must add the find          //
//-------------------------------//
full_sentence =  full_sentence + search_string.substring( i_Start_Of_Find , i_End_Of_Find ) ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)

skim_mail_k.l_Output_list.addItem (full_sentence );

//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate( full_sentence );
            full_sentence = "";
                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------//
//end of      extract_HREF=" function  //
//-------------------------------------//
//--------------------------------------------//
// start extract_equal_quote_slash  function  //
// give it 1 string                           //
// and the output appears in the lower        //
//  window                                    //
//--------------------------------------------//

public static void extract_equal_quote_slash(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;
              String full_sentence = "";
              String search_item  = "=\"/" ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

if((search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item )  ) 
       {
//-------------------------------------------//
//  remember where you found the start of it //
//  plus the beginning HREF="                //
//  WHICH WE DO NOT WANT                     //
//-------------------------------------------//
         i_Start_Of_Find = start_of_end+item_length ;

//-------------------------------//
// no ../                        //
//-------------------------------//
if(i_Start_Of_Find<realend)
{
while( search_string.substring( i_Start_Of_Find , i_Start_Of_Find+1 ).equals( "." ) )
       ++i_Start_Of_Find;
}
//-------------------------------//
// and no slashes , either       //
//-------------------------------//
if(i_Start_Of_Find<realend)
{
while( search_string.substring( i_Start_Of_Find , i_Start_Of_Find+1 ).equals( "/" ) )
       ++i_Start_Of_Find;
}
//-------------------------------//
// now start looking for the end //
//-------------------------------//
         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+5)<= realend ) // enough string left to check ??
              {
if(  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" ) 
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
               )

    {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();

//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+5)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+4 )).compareTo("http") != 0
&& (search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).compareTo("www" ) != 0
  ) full_sentence = skim_mail_k.BASE_URL + "/";
}
//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+4)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).equals("www") )
full_sentence = "http://";
}
//-------------------------------//
// we must add the find          //
//-------------------------------//
       full_sentence =  full_sentence + search_string.substring( i_Start_Of_Find , i_End_Of_Find ) ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)

skim_mail_k.l_Output_list.addItem (full_sentence );

//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate( full_sentence );
            full_sentence = "";
                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------------//
//end of extract_equal_quote_slash function  //
//-------------------------------------------//
//-------------------------------------//
//   start extract_http function       //
//                                     //
// give it 1 string                    //
// and the output appears in the lower //
//  window                             //
//-------------------------------------//

public static void extract_http(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;

              String search_item = "http://" ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

  if(  (search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item )   ) 
       {
         i_Start_Of_Find = start_of_end ;  //  remember where you found the start of it

         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+5)<= realend ) // enough string left to check ??
              {
//-------------------------------//
// look for closing quote        //
//-------------------------------//
if( (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" )
||  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
  )

             {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();

//-------------------------------//
// cut off trailing slash        //
//-------------------------------//
if( (search_string.substring( end_of_end-1 , end_of_end ) ).equals( "/" )  )
i_End_Of_Find--  ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)
skim_mail_k.l_Output_list.addItem ( search_string.substring( i_Start_Of_Find , i_End_Of_Find ));

//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate( search_string.substring( i_Start_Of_Find , i_End_Of_Find ) );

//skim_mail_k.l_Output_list.addItem ( search_string.substring( i_Start_Of_Find , i_End_Of_Find ));
//                     start_of_end= end_of_end+1;  // reset counters
                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------//
//   end of extract http  function     //
//-------------------------------------//
//-------------------------------------//
//   start extract_www.   function     //
// give it 1 string                    //
// and the output appears in the lower //
//  window                             //
//-------------------------------------//

public static void extract_www(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;
              String full_sentence = "";
              String search_item  = "www." ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

  if(  (search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item ) ) 
       {
//-------------------------------------------//
//  remember where you found the start of it //
//  plus the beginning www.                  //
//  WHICH WE DO     WANT                     //
//-------------------------------------------//
         i_Start_Of_Find = start_of_end ;

         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+5)<= realend ) // enough string left to check ??
              {
if( (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" )
||  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "'"  )
||  (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
  )

    {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();

//-------------------------------//
// cut off trailing slash        //
//-------------------------------//
if( (search_string.substring( end_of_end-1 , end_of_end ) ).equals( "/" )  )
i_End_Of_Find--  ;

//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+5)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+4 )).compareTo("http") != 0
&& (search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).compareTo("www" ) != 0
  ) full_sentence = skim_mail_k.BASE_URL + "/";
}
//-------------------------------//
// we must prefix the PARENT URL //
// only if a relative URL        //
//-------------------------------//
if ( (i_Start_Of_Find+4)<= realend )
{
if((search_string.substring( i_Start_Of_Find , i_Start_Of_Find+3 )).equals("www") )
full_sentence = "http://";
}
//-------------------------------//
// we must add the find          //
//-------------------------------//
       full_sentence =  full_sentence + search_string.substring( i_Start_Of_Find , i_End_Of_Find ) ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)

skim_mail_k.l_Output_list.addItem (full_sentence );

//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate( full_sentence );
            full_sentence = "";
                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------//
//   end of extract www.    function   //
//-------------------------------------//
//-------------------------------------//
//   start extract_mailto   function   //
// give it 1 string                    //
// and the output appears in the lower //
//  window                             //
//-------------------------------------//

public static void extract_mailto(  String search_string)

            {
              int end_of_end    = 0 ;       int start_of_end    = 0 ;
              int list_pointer  = 0 ;       int i_Start_Of_Find = 0 ;
              int i_End_Of_Find = 0 ;

              String search_item  = "mailto:" ;
              int item_length     = search_item.length() ;
              int realend         = search_string.length() ;
//---------------------------------------//
//          end of data                  //
//---------------------------------------------------------------//
//        loop is for number of characters in the item           //
//---------------------------------------------------------------//
top:
for (start_of_end= end_of_end ; start_of_end < realend ; start_of_end++ )
    { 
          if ( ( start_of_end+item_length )<= realend )   // enough string left to check ??
                {  // if yes   is it a match ??
//-------------------------------//
//        start comparison       //
//-------------------------------//

  if(  (search_string.substring( start_of_end , start_of_end+item_length ) ).equals( search_item ) ) 
       {
         i_Start_Of_Find = start_of_end + item_length  ;  //  remember where you found the start of it

         for(end_of_end=i_Start_Of_Find; end_of_end<=realend; end_of_end++)// start looking for the end of it
          {
            if ( (end_of_end+1)<= realend ) // enough string left to check ??
              {
if( (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\"" ) 
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( ">"  )  
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "\n" )  
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "?"  )  
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( ","  )  
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( "|"  )  
  || (search_string.substring( end_of_end , end_of_end+1 ) ).equals( " "  )
               )

             {
               i_End_Of_Find = end_of_end ;
               int i_length_Of_Input_List = (skim_mail_k.l_Upper_Window).countItems();

//-------------------------------//
// cut off trailing slash        //
//-------------------------------//
if( (search_string.substring( end_of_end-1 , end_of_end ) ).equals( "/" )  )
i_End_Of_Find--  ;

//-------------------------------//
// first find is special case    //
//-------------------------------//
if ( i_length_Of_Input_List == 0)
{

skim_mail_k.l_Upper_Window.addItem ( search_string.substring( i_Start_Of_Find , i_End_Of_Find ));
// update counter                        //
  String update = "" + (++skim_mail_k.emails ) ;
  skim_mail_k.emails_found.setText( update );
//-----------------------------------------------
skim_mail_k.OUTPUT_COPY = skim_mail_k.OUTPUT_COPY +  search_string.substring( i_Start_Of_Find , i_End_Of_Find ) +"\n";
skim_mail_k.OUTPUT_AREA.setText(skim_mail_k.OUTPUT_COPY );

}


//-------------------------------//
// all other cases               //
//-------------------------------//
if ( i_length_Of_Input_List > 0)
            no_duplicate_mail( search_string.substring( i_Start_Of_Find , i_End_Of_Find ) );

                     continue top ;
                   }
              }
          }
       }
     }
  }
} //        END OF =>     for (y = i_End_Of_Find ;list_pointer< realend ; y++ )

//-------------------------------------//
//   end of extract mailto function     //


//-------------------------------------//
//   start extract function            //
//                                     //
//-------------------------------------//

public static void extract()

{
      int depth = 0 ;
      int i_length_Of_Input_List = 0;
      int line_pointer= 0 ;
      int i_length_Of_Output_List = 0 ;
      int line_counter = 0 ;

            skim_mail_k.geturl();
//            t1.start();

//---------------------------------------//
//  first get number of lines            //
//  in the file                          //
//---------------------------------------//
i_length_Of_Input_List = (skim_mail_k.l_Input_File_List).countItems();

//---------------------------------------//
// set up a loop to process each line    //
//---------------------------------------//
for (line_pointer= 0 ;line_pointer < i_length_Of_Input_List; line_pointer++ )
   {

//---------------------------------------//
// start getting lines from file         //
//---------------------------------------//
       String tmp = skim_mail_k.l_Input_File_List.getItem(line_pointer);

       skim_mail_k.extract_www(  tmp ) ;
       skim_mail_k.extract_equal_slash( tmp ) ;
       skim_mail_k.extract_equal_quote_slash( tmp );
       skim_mail_k.extract_http( tmp );
       skim_mail_k.extract_src( tmp );
       skim_mail_k.extract_HREF( tmp );
       skim_mail_k.extract_href( tmp );
    }
//-------------------------------------//
//   depth                             //
//-------------------------------------//
         line_counter = 0 ;

   for ( depth = 0 ; depth <9 ; depth++ )
      {
         int new_end = (skim_mail_k.l_Output_list).countItems() ;

         for ( int eachurl = line_counter ; eachurl < new_end; eachurl++)
           {
//---------------------------------------//
// select item ( highlighted on screen ) //
//---------------------------------------//
     skim_mail_k.l_Output_list.select( eachurl ) ;

//--------------------------------------------//
// update number of URL's beingSearched       //
//--------------------------------------------//
(skim_mail_k.counter_field).setText( "getting link " + eachurl ) ;

            String address = "";
            address = skim_mail_k.l_Output_list.getItem(eachurl) ;
            (skim_mail_k.location_bar).setText( address ) ;

            skim_mail_k.geturl();
//            t1.start();
//--------------------------------------------//
// update number of URL's beingSearched       //
//--------------------------------------------//
address = "searching link " + eachurl ;(skim_mail_k.counter_field).setText( address ) ;

//---------------------------------------//
//  first get number of lines            //
//  in the file                          //
//---------------------------------------//
i_length_Of_Input_List = (skim_mail_k.l_Input_File_List).countItems();
//---------------------------------------//
// set up a loop to process each line    //
// in the first URL !!!!!!!!!!!!         //
//---------------------------------------//

for (line_pointer= 0 ;line_pointer < i_length_Of_Input_List; line_pointer++ )
   {
//---------------------------------------//
// start getting lines from file         //
//---------------------------------------//
       String tmp = skim_mail_k.l_Input_File_List.getItem(line_pointer);

//--------------------------------------------------------------//
// check for mail while we are here                             //
//--------------------------------------------------------------//
           skim_mail_k.extract_mailto( tmp ) ;

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_www(  tmp ) ;

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_equal_slash( tmp ) ;

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_equal_quote_slash( tmp );

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_http( tmp );

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_HREF( tmp );

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_href( tmp );

    }
         line_counter = new_end ;
         new_end = (skim_mail_k.l_Output_list).countItems() ;

//--------------------------------------------//
// update number of URL's beingSearched       //
//--------------------------------------------//
            address = "searching link " + line_counter ;

            (skim_mail_k.counter_field).setText( address ) ;

if ( new_end > (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
     new_end = (new Integer (skim_mail_k.link_limit.getText()) ).intValue() ;
}
        //-------------------------------------//
} //  <==   end of       depth                //
       //-------------------------------------//

//---------------------------------------//
//                   report              //
//---------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() > (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
(skim_mail_k.counter_field).setText( "Done getting links" ) ;

}

//-------------------------------------//
//   end of extract function           //
//-------------------------------------//

//--------------------------------------------//
// start of check for duplicate  function     //
//--------------------------------------------//

public static void no_duplicate( String line_To_Check )

   {
     int string_size = line_To_Check.length();

     String[] s_Input_List ;//used as => (xray3.l_Screen_List).getItems();
     s_Input_List = (skim_mail_k.l_Output_list).getItems();
     int i_length_Of_Input_List = (skim_mail_k.l_Output_list).countItems();
     boolean copy = false ;
     boolean shrunk = false ;

//-----------------------------------------------//
//      now check        the URL aginst all      //
//    previous URL's to prevent duplication      //
//-----------------------------------------------//
//top:
for (int list_pointer=0 ; list_pointer < i_length_Of_Input_List ; list_pointer++ )
    {
       string_size = line_To_Check.length();
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 1)
{
if( (line_To_Check.substring((string_size-1),string_size)).equals(",")  )
     line_To_Check= line_To_Check.substring( 0 , (string_size-1) ) ;
     string_size = line_To_Check.length();
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 1)
{
if( (line_To_Check.substring((string_size-1),string_size)).equals("'")  )
     line_To_Check= line_To_Check.substring( 0 , (string_size-1) ) ;
     string_size = line_To_Check.length();
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 1)
{
if( (line_To_Check.substring((string_size-1),string_size)).equals("<")  )
     line_To_Check= line_To_Check.substring( 0 , (string_size-1) ) ;
     string_size = line_To_Check.length();
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 5)
{
if( (line_To_Check.substring((string_size-5),string_size)).equals("sprev")  )
copy = true ;
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 4)
{
if( (line_To_Check.substring((string_size-4),string_size)).equals("prev")  )
copy = true ;
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 4)
{
if( (line_To_Check.substring((string_size-4),string_size)).equals("next")  )
copy = true ;
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 5)
{
if( (line_To_Check.substring((string_size-5),string_size)).equals("next5")  )
copy = true ;
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 4)
{
if( (line_To_Check.substring((string_size-4),string_size)).equals("skip")  )
copy = true ;
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 1)
{
if( (line_To_Check.substring((string_size-1),string_size)).equals(".")  )
     line_To_Check= line_To_Check.substring( 0 , (string_size-1) ) ;
     string_size = line_To_Check.length();
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size <  21 )  copy = true ;
//if( string_size > 95 )  copy = true ;

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("gif")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("mid")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 1)
{
if( (line_To_Check.substring( (string_size-1),string_size)).equals("(")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("dll")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 30)
{
if((line_To_Check.substring( 0 , 30  )).equals("http://www.siliconinvestor.com")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 29)
{
if((line_To_Check.substring( 0 , 29  )).equals("http://redirect.click2net.com")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 34)
{
if( (line_To_Check.substring( 0 , 34 )).equals("http://search3.go2net.com/crawler?")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 40)
{
if( (line_To_Check.substring( 0 , 40 )).equals("http://1travel.flifo.com/ae/cgi-programs")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 30)
{
if( (line_To_Check.substring( 0 , 30 )).equals("http://mc1.go2net.com/crawler?")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 21)
{
if( (line_To_Check.substring( 0 , 21 )).equals("http://www.uk.bol.com")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 21)
{
if( (line_To_Check.substring( 0 , 21 )).equals("http://www.go2net.com")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 28)
{
if( (line_To_Check.substring( 0 , 28 )).equals("http://info.netscape.com/fwd")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 30)
{
if( (line_To_Check.substring( 0 , 30 )).equals("http://cgi.weather.com/cgi-bin")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 9)
{
if( (line_To_Check.substring( 0 , 7 )).compareTo("http://") != 0 )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("css")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 15)
{
if( (line_To_Check.substring( 0 , 15 )).equals("http://adcenter")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 14)
{
if( (line_To_Check.substring( 0 , 14 )).equals("http://clicks.")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 21)
{
if( (line_To_Check.substring( 0 , 21 )).equals("http://www.webmarket.")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 30)
{
if( (line_To_Check.substring( 0 , 30 )).equals("http://www.zone.com/asp/script")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 16)
{
if( (line_To_Check.substring( 0 , 16 )).equals("http://adserver.")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 15)
{
if( (line_To_Check.substring( 0 , 15 )).equals("http://adfinity")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 18)
{
if( (line_To_Check.substring( 0 , 18 )).equals("http://www.mp3.com")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 14)
{
if( (line_To_Check.substring( 0 , 14 )).equals("http://adforce")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 30)
{
if( (line_To_Check.substring( 0 , 30 )).equals("http://leader.linkexchange.com")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 25)
{
if( (line_To_Check.substring( 0 , 25 )).equals("http://ad.doubleclick.net")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 13)
{
if( (line_To_Check.substring( 0 , 13 )).equals("http://click.")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 21)
{
if( (line_To_Check.substring( 0 , 21 )).equals("http://ad.preferences")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 21)
{
if( (line_To_Check.substring( 0 , 21 )).equals("http://www.stocksite.")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 10)
{
if( (line_To_Check.substring( 0 , 10 )).equals("http://ad0")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("jpg")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("JPG")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("jpe")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("wav")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 4)
{
if( (line_To_Check.substring( (string_size-4),string_size)).equals("aiff")  )
      copy = true ; 
}



//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("GIF")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("asp")  )
      copy = true ; 
}


//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("exe")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("pdf")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("mov")  )
      copy = true ; 
}


//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 2)
{
if( (line_To_Check.substring( (string_size-2),string_size)).equals("au")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 2)
{
if( (line_To_Check.substring( (string_size-2),string_size)).equals("rm")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 2)
{
if( (line_To_Check.substring( (string_size-2),string_size)).equals("ra")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("dtd")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("ent")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 4)
{
if( (line_To_Check.substring( (string_size-4),string_size)).equals("rdct")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 4)
{
if( (line_To_Check.substring( (string_size-4),string_size)).equals("icon")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 4)
{
if( (line_To_Check.substring( (string_size-4),string_size)).equals("logo")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 4)
{
if( (line_To_Check.substring( (string_size-4),string_size)).equals("jpeg")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 3)
{
if( (line_To_Check.substring( (string_size-3),string_size)).equals("dci")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
//if(string_size > 3)
//{
//if( (line_To_Check.substring( (string_size-3),string_size)).equals("cgi") == 0 )
//      copy = true ; 
//}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 1)
{
if( (line_To_Check.substring( (string_size-1),string_size)).equals("=")  )
      copy = true ; 
}
//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 1)
{
if( (line_To_Check.substring( (string_size-1),string_size)).equals(";")  )
      copy = true ; 
}

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if(string_size > 1)
{
if( (line_To_Check.substring((string_size-1),string_size)).equals("/")  )
     line_To_Check= line_To_Check.substring( 0 , (string_size-1) ) ;
    
}


//---------------------------------------------------//
//  check for duplicate entry                        //
//                                                   //
//---------------------------------------------------//
   if( (line_To_Check).equals(s_Input_List[ list_pointer ])  )
                { copy = true ; continue ;  }

    }
      if ( copy == false )
             skim_mail_k.l_Output_list.addItem ( line_To_Check ) ;

//---------------------------------------//
// update counter                        //
//---------------------------------------//
       String update = "" + ( i_length_Of_Input_List ) ;
       skim_mail_k.links_found.setText( update );
           }

//--------------------------------------------//
// END  of check for duplicate  function     //
//--------------------------------------------//

//---------------------------------------------//
// start of check for duplicate mail  function //
//---------------------------------------------//

public static void no_duplicate_mail( String line_To_Check )

   {
     String[] s_Input_List ;//used as => (xray3.l_Screen_List).getItems();
     s_Input_List = (skim_mail_k.l_Upper_Window).getItems();
     int i_length_Of_Upper_Window = (skim_mail_k.l_Upper_Window).countItems();
     boolean copy = false ;

//-----------------------------------------------//
//      now check        the URL aginst all      //
//    previous URL's to prevent duplication      //
//-----------------------------------------------//

//---------------------------------------------------//
//  check for illegal ends and types                 //
//                                                   //
//---------------------------------------------------//
if( line_To_Check.length() < 9)  copy = true ;


for (int list_pointer=0 ; list_pointer < i_length_Of_Upper_Window ; list_pointer++ )
    { if( (line_To_Check).equals(s_Input_List[ list_pointer ])  )
      copy = true ; continue ;//top;

    }
      if ( copy == false )
           {
             skim_mail_k.l_Upper_Window.addItem ( line_To_Check ) ;

     skim_mail_k.OUTPUT_COPY =       skim_mail_k.OUTPUT_COPY + line_To_Check +"\n";
     skim_mail_k.OUTPUT_AREA.setText(skim_mail_k.OUTPUT_COPY );

//---------------------------------------//
// update counter                        //
//---------------------------------------//
       String update = "" + (++skim_mail_k.emails ) ;
       skim_mail_k.emails_found.setText( update );
           }

}

//------------------------------------------------//
// END  of check for duplicate email function     //
//------------------------------------------------//
//-------------------------------------//
//   start of geturlmail  function     //
//-------------------------------------//

public static void geturlmail()
     {
        URL url;                  InputStream isIn;   // File fOut;
        int iChar;                int iCount = 0;     int xx =0 ;
        String tmp="" ;           char c ;            String tmpurl ;
//--------------------------------------------//
//  load address from location bar            //
//  into variable for new URL                 //
//--------------------------------------------//
        tmpurl = (skim_mail_k.location_bar).getText() ;

        try
          {
          url = new URL (tmpurl);
          isIn = url.openStream ();
//--------------------------------------------//
//  clean list of previous contents           //
//--------------------------------------------//      
          skim_mail_k.l_Mail_Html_List.removeAll() ;

          while ((iChar = isIn.read ()) != -1)
            {
                  iCount++;
                  c = (char)( iChar );

    if ( iChar > 27 )  tmp = tmp +  String.valueOf(c);
 
    if (   (iChar == 13)  || (c == '>')   )

               { skim_mail_k.l_Mail_Html_List.addItem( tmp);
                 tmp="";

               }
            }
          }
              catch (Exception e)
                 {
                  }
}

//-------------------------------------//
//   end of geturlmail function        //
//-------------------------------------//
//   start of get url     function     //
//-------------------------------------//

public static void geturl()
     {
        URL url;                  InputStream isIn;   // File fOut;
        int iChar;                int iCount = 0;     int xx =0 ;
        String tmp="" ;           char c ;            String tmpurl ;
//--------------------------------------------//
//                                            //
//  load address from location bar            //
//  into variable for new URL                 //
//--------------------------------------------//
        tmpurl = (skim_mail_k.location_bar).getText() ;

//--------------------------------------------//
//                                            //
//  now determine the base url                //
//--------------------------------------------//
int url_length= tmpurl.length();
int here = 0 ;

      for( int y=0 ; y <url_length ; y++)

           {   if( tmpurl.substring( y , y+1 ).equals( "/" )  ) 
                  here = y ;
           }
     if ( here < 8 ) skim_mail_k.BASE_URL = tmpurl;
     if ( here > 8 ) skim_mail_k.BASE_URL = tmpurl.substring( 0 , here );
//--------------------------------------------//
//  END OF                                    //
//  now determine the base url                //
//--------------------------------------------//


        try
          {
          url = new URL (tmpurl);
          isIn = url.openStream ();
//--------------------------------------------//
//  clean list of previous contents           //
//--------------------------------------------//      
          skim_mail_k.l_Input_File_List.removeAll() ;

          while ((iChar = isIn.read ()) != -1)
            {
                  iCount++;
                  c = (char)( iChar );

    if ( iChar > 27 )  tmp = tmp +  String.valueOf(c);
 
    if (   (iChar == 13)  || (c == '>')   )

               { skim_mail_k.l_Input_File_List.addItem( tmp);
                 tmp="";
               }
            }
          }
              catch (Exception e)
                 {
                  }
}

//-------------------------------------//
//   end of get url function           //
//-----------------------------------------------------------//
// define GLOBALS                                            //
//-----------------------------------------------------------//
          public static int MINIMUM_LINKS = 0 ;
          public static List l_Input_File_List ;
          public static List l_Upper_Window    ;
          public static List l_Output_list     ;
          public static List l_Mail_Html_List  ;
          public static List l_Lower_Window    ;
          public static TextField location_bar ;
          public static TextField counter_field ;
          public static String BASE_URL="" ;

          public static String OUTPUT_COPY="" ;
          public static TextArea OUTPUT_AREA;

//-----------------------------------------------------------//
// define GLOBAL text fields for user input and progress     //
//-----------------------------------------------------------//

public static TextField link_limit   ;
public static TextField links_found  ;
public static TextField emails_found ;
public static TextField topic        ;

public static int emails=0           ;

public static Extraction_Thread t1 = new Extraction_Thread();
//                                http://search.go2net.com/crawler?general=rayguns
public static String BEGINNING = "http://search.go2net.com/crawler?general=";
//                                &method=2&target=&region=0&rpp=30&timeout=120&hpe=30&format=power&eng=AltaVista&eng=Excite&eng=Infoseek&eng=Lycos&eng=WebCrawler&eng=Yahoo&eng=Thunderstone&eng=LookSmart&eng=MiningCo"
//public static String ENDING    = "&method=2&target=&region=0&rpp=30&timeout=60&hpe=30";
public static String ENDING    = "&method=2&target=&region=0&rpp=30&timeout=120&hpe=30&format=power&eng=AltaVista&eng=Excite&eng=Infoseek&eng=Lycos&eng=WebCrawler&eng=Yahoo&eng=Thunderstone&eng=LookSmart&eng=MiningCo";

//-----------------------------------------------------------//
// END OF GLOBALS   DEFINITION                               //
//-----------------------------------------------------------//


      public static void main (String args[])
        {
//      Extraction_Thread t1 = new Extraction_Thread();
//      t1.start();

        MyFrame mf;

//-----------------------------------------------------------//
// define labels for textfields under buttons                //
//-----------------------------------------------------------//
          Label lab_05 = new Label("links to find " , Label.RIGHT) ;
          Label lab_06 = new Label("links "   , Label.RIGHT) ;
          Label lab_07 = new Label("emails "  , Label.RIGHT) ;
          Label lab_08 = new Label("topic "  , Label.RIGHT) ;

//-----------------------------------------------------------//
// define labels                                             //
//  AND PROGRAM TITLE BAR                                    //
//-----------------------------------------------------------//
          Label lab_01 = new Label("") ;
          Label lab_02 = new Label("") ;
          Label lab_03 = new Label("") ;
          Label lab_04 ;//= new Label("Extractor") ;

          lab_01.setBackground( Color.lightGray) ;
          lab_02.setBackground( Color.lightGray) ;
          lab_03.setBackground( Color.lightGray) ;
          lab_04 = new Label("   Skim mail(k) ") ;
          lab_04.setFont( new Font ("TimesRoman" , Font.PLAIN , 25 ));

          l_Upper_Window    = new List() ;
          l_Output_list     = new List() ;
          l_Mail_Html_List  = new List() ;
          l_Lower_Window    = new List() ;
          l_Input_File_List = new List() ;

          location_bar     =  new TextField("http://search.go2net.com/crawler?general=java&method=2&target=&region=0&rpp=20&timeout=5&hpe=10");
          counter_field    =  new TextField(" ");

          emails_found   = new TextField("0");
          link_limit     = new TextField("99");
          links_found    = new TextField(" ");
          topic          = new TextField("email");

          OUTPUT_COPY     = " cut and paste.........\n\n\n" ;
          OUTPUT_AREA     = new TextArea() ;
OUTPUT_AREA.setText(OUTPUT_COPY ) ;


//-----------------------------------------------------------//
//                                                           //
//    create a new frame  mf = new MyFrame ();               //
//-----------------------------------------------------------//
        mf = new MyFrame ();

//-----------------------------------------------------------//
//                                                           //
//  give the new frame a size  mf.resize (600, 300);         //
//-----------------------------------------------------------//
        mf.resize (600, 450);

//------------------------------------------------------------------//
// declare the buttons                                              //
//                                                                  //
//Button button_01 , button_02 , button_03 , button_04 , button_05; //
//------------------------------------------------------------------//
        Button button_01 , button_02 , button_03 , button_04 , button_05 , button_06;
        Button button_07 , button_08 , button_09 , button_10 , button_11 , button_12;

//-----------------------------------------------------------//
//  declare the outer most panel                             //
//-----------------------------------------------------------//
        Panel p_Full_Screen = new Panel ();

//-----------------------------------------------------------//
//  declare the outer most panel  characteristics            //
//-----------------------------------------------------------//
              p_Full_Screen.setBackground( Color.lightGray) ;
              p_Full_Screen.setFont( new Font ("TimesRoman" , Font.PLAIN , 15 ));

//------------------------------------------------------------//
// the outer most layout manager is border layout             //
// north gets split horizontally for buttons and location bar //
//  and padding                                               //
//------------------------------------------------------------//
        Panel p_Split_North = new Panel ();

//-----------------------------------------------------------//
// the uppermost horizontal split is split again             //
// for five buttons                                          //
//                                                           //
//-----------------------------------------------------------//
        Panel p_Split_Top_North = new Panel ();

//-----------------------------------------------------------//
// the center of the outer most layout manager is            //
// split into 2 horizontal pieces for l_Upper_Win            //
//  and l_Lower_Win                                          //
//-----------------------------------------------------------//
        Panel p_Split_Center  = new Panel ();

//-----------------------------------------------------------//
//  create  the outer most panel                             //
//-----------------------------------------------------------//
        p_Full_Screen.setLayout( new BorderLayout( 5 , 5 )) ;

//-----------------------------------------------------------//
//  create the grid that splits north in 3                   //
//  as in north , center , south                             //
//-----------------------------------------------------------//
        p_Split_North.setLayout( new BorderLayout( 5 , 5 )) ;

//-----------------------------------------------------------//
//  create the grid that splits the top of the last grid     //
//  into eight  horizontal pieces for the 8 buttons          //
//  and 4 textfields for data and four  labels               //
//-----------------------------------------------------------//
        p_Split_Top_North.setLayout( new GridLayout( 2, 8 , 5 , 5 )) ;
       
//--------------------------------------------------------------------------//
// create the grid that splits the center of the outer most                 //
// layout manager into 2 horizontal pieces for l_Upper_Win                  //                         //
//  and l_Lower_Win                                                         //
//--------------------------------------------------------------------------//
        p_Split_Center.setLayout( new GridLayout( 2 , 1 , 5 , 5 )) ;

//-----------------------------------------------------------//
// add the first button. grids  load left to right           //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_01 = new Button( "Extract URL" ) ) ;

//-----------------------------------------------------------//
// add the first button. grids  load left to right           //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_07 = new Button( "Extract topic" ) ) ;

//-----------------------------------------------------------//
// add the second button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_02 = new Button( "pause" ) ) ;

//-----------------------------------------------------------//
// add the third  button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_03 = new Button( "resume") ) ;

//-----------------------------------------------------------//
// add the fourth button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_04 = new Button( "Help"  ) ) ;

//-----------------------------------------------------------//
// add the fifth  button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_05 = new Button( "Exit") ) ;

//-----------------------------------------------------------//
// add the sixth  button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_05 = new Button( "About" ) ) ;

//-----------------------------------------------------------//
// add the sixth  button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( button_08 = new Button( "" ) ) ;

//-----------------------------------------------------------//
// now we do the text boxes and labels                       //
//-----------------------------------------------------------//

//-----------------------------------------------------------//
// add the first labe. grids  load left to right           //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( lab_05 ) ;

//-----------------------------------------------------------//
// add the second button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( skim_mail_k.link_limit ) ;

//-----------------------------------------------------------//
// add the first labe. grids  load left to right             //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( lab_08 ) ;

//-----------------------------------------------------------//
// add the second button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( skim_mail_k.topic ) ;

//-----------------------------------------------------------//
// add the third  button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( lab_06 ) ;

//-----------------------------------------------------------//
// add the fourth button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( skim_mail_k.links_found ) ;

//-----------------------------------------------------------//
// add the fifth  button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( lab_07 ) ;

//-----------------------------------------------------------//
// add the sixth  button. grids  load left to right          //
// top to bottom                                             //
//-----------------------------------------------------------//
          p_Split_Top_North.add( skim_mail_k.emails_found ) ;

//-----------------------------------------------------------//
//  add the title bar to the uppermost panel                 //
//  in the second border layout                              //
//-----------------------------------------------------------//
          p_Split_North.add("North" ,lab_04 );

//-----------------------------------------------------------//
//  add the buttons to the "center"  panel  of the second    //
// border layout manager which subdivides                    //
//             "North" in the outermost layout manager       //
//-----------------------------------------------------------//
          p_Split_North.add( "Center" ,p_Split_Top_North);

//-----------------------------------------------------------//
// add the location bar to lower split                       //
//-----------------------------------------------------------//
          p_Split_North.add( "South" ,location_bar);

//-----------------------------------------------------------//
//  add just filled grid to north in      p_Full_Screen      //
//-----------------------------------------------------------//
        p_Full_Screen.add ("North",  p_Split_North);

//-----------------------------------------------------------//
//  add lists to  p_Split_Center                             //
//-----------------------------------------------------------//
//        p_Split_Center.add( l_Upper_Window ) ;
          p_Split_Center.add( OUTPUT_AREA ) ;
//-----------------------------------------------------------//
//  the following line makes the URL's    invisible          //
// by inserting  an unused list into the layout manager      //
//-----------------------------------------------------------//
//      p_Split_Center.add( l_Lower_Window ) ;

//-----------------------------------------------------------//
//  the following line makes the URL's   visible             //
// by inserting the output list into the layout manager      //
//-----------------------------------------------------------//
        p_Split_Center.add( l_Output_list ) ;

//-----------------------------------------------------------------//
//  add just filled p_Split_Center to north in  p_Full_Screen      //
//-----------------------------------------------------------------//
        p_Full_Screen.add ("Center",  p_Split_Center);

//-----------------------------------------------------------//
//  add labels to east , west and south in  p_Full_Screen    //
//-----------------------------------------------------------//
        p_Full_Screen.add ("East" , lab_01);
        p_Full_Screen.add ("West" , lab_02);
        p_Full_Screen.add ("South", counter_field);

//-----------------------------------------------------------//
//  add just filled p_Full_Screen  to mf                     //
//-----------------------------------------------------------//
        mf.add ( p_Full_Screen);

//-----------------------------------------------------------//
//  show the frame                                           //
//-----------------------------------------------------------//
        mf.show ();
      }
    }

//-----------------------------------------------------------//
//   END OF MAIN                                             //
//-----------------------------------------------------------//


//-------------------------------------//
//   start extract function            //
//                                     //
//-------------------------------------//

class Extraction_Thread extends Thread {
//   1.  extend class java.lang.Thread and override run()
   public void run() {

//public static void extract()

{
      int depth = 0 ;
      int i_length_Of_Input_List = 0;
      int line_pointer= 0 ;
      int i_length_Of_Output_List = 0 ;
      int line_counter = 0 ;

            skim_mail_k.geturl();
//            t1.start();

//---------------------------------------//
//  first get number of lines            //
//  in the file                          //
//---------------------------------------//
i_length_Of_Input_List = (skim_mail_k.l_Input_File_List).countItems();

//---------------------------------------//
// set up a loop to process each line    //
//---------------------------------------//
for (line_pointer= 0 ;line_pointer < i_length_Of_Input_List; line_pointer++ )
   {

//---------------------------------------//
// start getting lines from file         //
//---------------------------------------//
       String tmp = skim_mail_k.l_Input_File_List.getItem(line_pointer);

       skim_mail_k.extract_www(  tmp ) ;
       skim_mail_k.extract_equal_slash( tmp ) ;
       skim_mail_k.extract_equal_quote_slash( tmp );
       skim_mail_k.extract_http( tmp );
       skim_mail_k.extract_HREF( tmp );
       skim_mail_k.extract_href( tmp );
    }
//-------------------------------------//
//   depth                             //
//-------------------------------------//
         line_counter = 0 ;

   for ( depth = 0 ; depth <9 ; depth++ )
      {
         int new_end = (skim_mail_k.l_Output_list).countItems() ;

         for ( int eachurl = line_counter ; eachurl < new_end; eachurl++)
           {
//---------------------------------------//
// select item ( highlighted on screen ) //
//---------------------------------------//
     skim_mail_k.l_Output_list.select( eachurl ) ;

//--------------------------------------------//
// update number of URL's beingSearched       //
//--------------------------------------------//
(skim_mail_k.counter_field).setText( "getting link " + eachurl ) ;

            String address = "";
            address = skim_mail_k.l_Output_list.getItem(eachurl) ;
            (skim_mail_k.location_bar).setText( address ) ;

            skim_mail_k.geturl();
//            t1.start();
//--------------------------------------------//
// update number of URL's beingSearched       //
//--------------------------------------------//
address = "searching link " + eachurl ;(skim_mail_k.counter_field).setText( address ) ;

//---------------------------------------//
//  first get number of lines            //
//  in the file                          //
//---------------------------------------//
i_length_Of_Input_List = (skim_mail_k.l_Input_File_List).countItems();
//---------------------------------------//
// set up a loop to process each line    //
// in the first URL !!!!!!!!!!!!         //
//---------------------------------------//

for (line_pointer= 0 ;line_pointer < i_length_Of_Input_List; line_pointer++ )
   {
//---------------------------------------//
// start getting lines from file         //
//---------------------------------------//
       String tmp = skim_mail_k.l_Input_File_List.getItem(line_pointer);

//--------------------------------------------------------------//
// check for mail while we are here                             //
//--------------------------------------------------------------//
           skim_mail_k.extract_mailto( tmp ) ;

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_www(  tmp ) ;

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_equal_slash( tmp ) ;

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_equal_quote_slash( tmp );

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_http( tmp );

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_HREF( tmp );

//--------------------------------------------------------------//
// check after every extraction to see if the limit is exceeded //
//--------------------------------------------------------------//
if ( (skim_mail_k.l_Output_list).countItems() <= (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
       skim_mail_k.extract_href( tmp );

    }
         line_counter = new_end ;
         new_end = (skim_mail_k.l_Output_list).countItems() ;
//---------------------------------------//
//                   report              //
//---------------------------------------//
//--------------------------------------------//
// update number of URL's beingSearched       //
//--------------------------------------------//
            address = "searching link " + ( depth + eachurl) ;

            (skim_mail_k.counter_field).setText( address ) ;

if ( new_end > (new Integer (skim_mail_k.link_limit.getText()) ).intValue())
     new_end = (new Integer (skim_mail_k.link_limit.getText()) ).intValue() ;
}
        //-------------------------------------//
} //  <==   end of       depth                //
       //-------------------------------------//

}

//         setPriority( getPriority() +1 );
   }
        //---------------------------------------//
} //  <==   end of extract function              //
       //----------------------------------------//

//-----------------------------------------------------------//
//  START OF CHECK BUTTONS                                   //
//-----------------------------------------------------------//

    class MyFrame extends Frame
      {

public boolean action (Event evt, Object obj  )

  {
//-------------------------------------//
//   check if  extract URL             //
//-------------------------------------//

       if ("Extract URL".equals (obj))

       {  
                                     
//--------------------------------------------//
// update        //
//--------------------------------------------//
(skim_mail_k.counter_field).setText( "Start getting links" ) ;

//-------------------------------------------------//
//   java does not care about the                  //
// parenthesis around the global.                  //
// I use them for clarity                          //
//   gbg = (skim_mail_k.l_Output_list).getText() ;     //
//-------------------------------------------------//
          skim_mail_k.BASE_URL= (skim_mail_k.location_bar).getText() ;

          skim_mail_k.geturl();
//--------------------------------------------//
// update        //
//--------------------------------------------//
(skim_mail_k.counter_field).setText( "start extraction" ) ;

//          skim_mail_k.extract();
            skim_mail_k.t1.start();
       }

//-------------------------------------//
//   end of check if extract  URL      //
//-------------------------------------//

//-------------------------------------//
//   check if  extract TOPIC           //
//-------------------------------------//

       if ("Extract topic".equals (obj))

       {  
                                     
//--------------------------------------------//
// update        //
//--------------------------------------------//
(skim_mail_k.counter_field).setText( "Start getting links" ) ;

//-------------------------------------------------//
//   java does not care about the                  //
// parenthesis around the global.                  //
// I use them for clarity                          //
//   gbg = (skim_mail_k.l_Output_list).getText() ;          //
//-------------------------------------------------//
String tmp_topic = (new String (skim_mail_k.topic.getText()) );//.stringValue() ;
String tmp_topic2 = skim_mail_k.BEGINNING + tmp_topic + skim_mail_k.ENDING ;
(skim_mail_k.location_bar).setText( tmp_topic2 ) ;

          skim_mail_k.BASE_URL= "";

          skim_mail_k.geturl();
//--------------------------------------------//
// update        //
//--------------------------------------------//
(skim_mail_k.counter_field).setText( "start extraction" ) ;

//          skim_mail_k.extract();
            skim_mail_k.t1.start();
       }

//-------------------------------------//
//   end of check if extract  URL      //
//-------------------------------------//





//-------------------------------------//
//   start of resume                   //
//-------------------------------------//

       if ("resume".equals (obj))

           {    skim_mail_k.t1.resume() ;
           }

//-------------------------------------//
//   end of resume                     //
//-------------------------------------//
//-------------------------------------//
//   start of pause                    //
//-------------------------------------//

       if ("pause".equals (obj))

           {    skim_mail_k.t1.suspend() ;
           }

//-------------------------------------//
//   end of pause                      //
//-------------------------------------//
//-------------------------------------//
//   start of exit                     //
//-------------------------------------//

       if ("Exit".equals (obj))

           {    System.exit( 0) ;
           }

//-------------------------------------//
//   end of exit                       //
//-------------------------------------//
//   check if About                    //
//-------------------------------------//

       if ("About".equals (obj))

           {

              MyFrame mf ;
              mf = new MyFrame() ;
              MyDialog d;
              MyWindow w;
              Button btnOKDialog;
              Button btnOKWindow;
          
              w = new MyWindow (mf);
              w.reshape (450, 60, 300, 300);

     TextArea taAbout = new TextArea("\n      Skim mail(k)  \n      protoware\n\nmark burns springer\ndeacons folly\nnorth harwich, ma. 02645\n\n mbspringer@worldnet.att.net",12 , 30 , TextArea.SCROLLBARS_NONE);
              taAbout.setBackground(Color.cyan);
              taAbout.setFont (new Font ("Helvetica",  Font.BOLD, 18));
              w.add ("Center", taAbout);
              btnOKWindow = new Button ("Click to close");
              w.add ("South", btnOKWindow);
              w.show ();
         }

//-------------------------------------//
//   end of About                      //
//-------------------------------------//
//   check if Help                     //
//-------------------------------------//

       if ("Help".equals (obj))

           {
              MyFrame mf ;
              mf = new MyFrame() ;
              MyDialog d;
              MyWindow w;
              Button btnOKDialog;
              Button btnOKWindow;
          
              w = new MyWindow (mf);
              w.reshape (300, 40, 450, 500);

     TextArea taHelp = new TextArea("\n      Skim mail(k) HELP  updated:  April 30 1999\n___________________\n\nWhat this program does\n\n   Exract email addresses from HTML,\nit looks for a MAILTO: tag  and takes the address\nwhich follows.\n___________________\n\n\n\n COPY THE url FROM THE LOCATION BAR\nof your favorite browser after a search.\nfor example: with your favorite browser go\nto a search site and run a search.\ntake the the URL that comes back\nand paste it into Extractor.\n\n\n___________________\n\nThe program slows considerably as the number of\nURL's to check grows, as each URL is checked against\nthe ever growing list to make sure that it\nhas not already been added.\n\nFIXES:----------------\n\nAPRIL 28 1999  PAUSE AND RESUME INSTALLED\nAPRIL 28 1999  HELP UPDATED\nAPRIL 30 1999  Base URL UPDATED\nsee lines 1759<=>1776\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n___________________\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nmark burns springer\ndeacons folly\nnorth harwich, ma. 02645" ,6 , 20 , TextArea.SCROLLBARS_BOTH);
              taHelp.setBackground(Color.cyan);
              taHelp.setFont (new Font ("Helvetica",  Font.PLAIN, 18));
              w.add ("Center", taHelp);
              btnOKWindow = new Button ("Click to close");
              btnOKWindow.setFont (new Font ("Helvetica",  Font.BOLD, 15));
              w.add ("South", btnOKWindow);
              w.show ();
             }

//-------------------------------------//
//   END OF HELP                       //
//-------------------------------------//


return (true);

    //-------------------------------------------------------------------//
}   //  <======== end of public boolean action (Event evt, Object obj  ) //
    //-------------------------------------------------------------------//

//-------------------------------------------------------------------//
// start of          public boolean handleEvent (Event evt)          //
//-------------------------------------------------------------------//
      public boolean handleEvent (Event evt)
        {

//-------------------------------------//
//   start of list                     //
//-------------------------------------//

       if (evt.id == Event.LIST_SELECT)

  {
//        skim_mail_k.select_Item( evt );
  }


//-------------------------------------//
//   end of list                       //
//-------------------------------------//

        if (evt.id == Event.WINDOW_DESTROY)
          {
          System.exit (0);
          }
        return (super.handleEvent (evt));
        }

    //-------------------------------------------------------------------//
}   //  <======== end of          public boolean handleEvent (Event evt) //
    //-------------------------------------------------------------------//

//
//--------------------------------------------------------
//

    class MyDialog extends Dialog
      {
      public MyDialog (Frame fr, String s, boolean bModal)
        {
        super (fr, s, bModal);
        }

      public boolean handleEvent (Event evt)
        {
        Label l;

        switch (evt.id)
          {
          case Event.WINDOW_DESTROY:             // Close from System Menu
            this.dispose ();
            break;

          case Event.ACTION_EVENT:
            if ("Click to close".equals (evt.arg))           // Dialog's OK Button
              {
              this.dispose ();
              }
            break;
          }
        return (super.handleEvent (evt));
        }
      }


//
//----------------------------
//


    class MyWindow extends Window
      {
      public MyWindow (Frame fr)
        {
        super (fr);
        }

      public boolean handleEvent (Event evt)
        {
        Label l;

        switch (evt.id)
          {
          case Event.WINDOW_DESTROY:             // Close from System Menu
            this.dispose ();
            break;

          case Event.ACTION_EVENT:
            if ("Click to close".equals (evt.arg))           // Window's OK Button
              {
              this.dispose ();
              }
            break;
          }
        return (super.handleEvent (evt));
        }
      }
