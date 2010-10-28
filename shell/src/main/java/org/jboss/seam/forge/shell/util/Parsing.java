package org.jboss.seam.forge.shell.util;

public abstract class Parsing
{
   public static int firstWhitespace(String str)
   {
      int len = str.length();
      for (int i = 0; i < len; i++)
      {
         switch (str.charAt(i))
         {
         case '\t':
         case ' ':
            return i;
         }

      }

      return str.length();
   }

   public static String firstToken(String str) {
      return str.substring(0, firstWhitespace(str));
   }
}