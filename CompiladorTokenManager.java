/* Generated By:JavaCC: Do not edit this line. CompiladorTokenManager.java */

/** Token Manager. */
public class CompiladorTokenManager implements CompiladorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xf403ff00L) != 0L)
         {
            jjmatchedKind = 33;
            return 2;
         }
         return -1;
      case 1:
         if ((active0 & 0x4000L) != 0L)
            return 2;
         if ((active0 & 0xf403bf00L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0x80001800L) != 0L)
            return 2;
         if ((active0 & 0x7403a700L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 2;
            }
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x50008000L) != 0L)
            return 2;
         if ((active0 & 0x24032700L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0x20010100L) != 0L)
            return 2;
         if ((active0 & 0x4022600L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 4;
            return 2;
         }
         return -1;
      case 5:
         if ((active0 & 0x4000600L) != 0L)
            return 2;
         if ((active0 & 0x22000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 5;
            return 2;
         }
         return -1;
      case 6:
         if ((active0 & 0x2000L) != 0L)
            return 2;
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 9:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 10:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 11:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 12:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 13:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 14:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 15:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      case 16:
         if ((active0 & 0x20000L) != 0L)
         {
            if (jjmatchedPos < 5)
            {
               jjmatchedKind = 33;
               jjmatchedPos = 5;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 32);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 40:
         return jjStopAtPos(0, 3);
      case 41:
         return jjStopAtPos(0, 4);
      case 42:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 43:
         return jjStopAtPos(0, 21);
      case 44:
         return jjStopAtPos(0, 24);
      case 45:
         return jjStopAtPos(0, 22);
      case 46:
         return jjStopAtPos(0, 25);
      case 47:
         return jjMoveStringLiteralDfa1_0(0xc000000000L);
      case 59:
         return jjStopAtPos(0, 7);
      case 60:
         return jjStopAtPos(0, 20);
      case 61:
         return jjStopAtPos(0, 18);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 91:
         return jjStopAtPos(0, 1);
      case 93:
         return jjStopAtPos(0, 2);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x5800L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x80000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x50000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 123:
         return jjStopAtPos(0, 5);
      case 125:
         return jjStopAtPos(0, 6);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 42:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStopAtPos(1, 39);
         break;
      case 47:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStopAtPos(1, 38);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x84000400L);
      case 102:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 2);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x40010000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x8100L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x40010000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x28000L);
      case 116:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0xc00L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 119:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(2, 31, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(3, 15, 2);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(3, 28, 2);
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x12200L);
      case 115:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x20000100L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 91:
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 101:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 2);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 2);
         return jjMoveStringLiteralDfa5_0(active0, 0x22000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 115:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 2);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 93:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(5, 11);
         break;
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000L);
      case 99:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 2);
         break;
      case 104:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(5, 26, 2);
         break;
      case 109:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000L);
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(5, 10, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 117:
         return jjMoveStringLiteralDfa9_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa10_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 46:
         return jjMoveStringLiteralDfa11_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa12_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa13_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa14_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa15_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
static private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 116:
         return jjMoveStringLiteralDfa16_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa17_0(active0, 0x20000L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
static private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(17, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 27)
                     kind = 27;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\133", "\135", "\50", "\51", "\173", "\175", "\73", 
"\143\154\141\163\163", "\160\165\142\154\151\143", "\162\145\164\165\162\156", 
"\151\156\164\40\133\135", "\151\156\164", "\142\157\157\154\145\141\156", "\151\146", 
"\145\154\163\145", "\167\150\151\154\145", 
"\123\171\163\164\145\155\56\157\165\164\56\160\162\151\156\164\154\156", "\75", "\46\46", "\74", "\53", "\55", "\52", "\54", "\56", 
"\154\145\156\147\164\150", null, "\164\162\165\145", "\146\141\154\163\145", "\164\150\151\163", 
"\156\145\167", "\41", null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffffffffL, 
};
static final long[] jjtoSkip = {
   0x1fc00000000L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[3];
static private final int[] jjstateSet = new int[6];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 3; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        image.append(jjstrLiteralImages[1]);
        lengthOfMatch = jjstrLiteralImages[1].length();
                                  System.out.println("CorcheteIzquierdo -> "+ image);
         break;
      case 2 :
        image.append(jjstrLiteralImages[2]);
        lengthOfMatch = jjstrLiteralImages[2].length();
                                System.out.println("CorcheteDerecho -> "+ image);
         break;
      case 3 :
        image.append(jjstrLiteralImages[3]);
        lengthOfMatch = jjstrLiteralImages[3].length();
                                    System.out.println("ParentesisIzquierdo -> "+image);
         break;
      case 4 :
        image.append(jjstrLiteralImages[4]);
        lengthOfMatch = jjstrLiteralImages[4].length();
                                  System.out.println("ParentesisDerecho -> "+image);
         break;
      case 5 :
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
                               System.out.println("LlaveIzquierda -> "+ image);
         break;
      case 6 :
        image.append(jjstrLiteralImages[6]);
        lengthOfMatch = jjstrLiteralImages[6].length();
                             System.out.println("LlaveDerecha -> "+ image);
         break;
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                          System.out.println("Punto y coma -> "+ image);
         break;
      case 8 :
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
                          System.out.println("\u005cnClase -> " + image);
         break;
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                             System.out.println("Publico -> "+ image);
         break;
      case 10 :
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
                              System.out.println("Regresar -> "+ image);
         break;
      case 11 :
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
                                   System.out.println("EnteroArreglo -> "+ image);
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
                         System.out.println("Entero -> "+ image);
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                               System.out.println("Booleano -> "+ image);
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                    System.out.println("Si -> "+ image);
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                            System.out.println("Entonces -> "+ image);
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                             System.out.println("Mientras -> "+ image);
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                                          System.out.println("Imprimir -> "+ image);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                           System.out.println("Asignacion -> "+ image);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                   System.out.println("Y -> "+ image);
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                         System.out.println("Menor que -> "+ image);
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                     System.out.println("Suma -> "+ image);
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                      System.out.println("Resta -> "+ image);
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                               System.out.println("Multiplicacion -> "+ image);
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                      System.out.println("Coma -> "+ image);
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                      System.out.println("Punto -> "+ image);
         break;
      case 26 :
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                              System.out.println("Longitud -> "+ image);
         break;
      case 27 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                System.out.println("Numero -> "+ image);
         break;
      case 28 :
        image.append(jjstrLiteralImages[28]);
        lengthOfMatch = jjstrLiteralImages[28].length();
                             System.out.println("Verdadero -> "+ image);
         break;
      case 29 :
        image.append(jjstrLiteralImages[29]);
        lengthOfMatch = jjstrLiteralImages[29].length();
                          System.out.println("Falso ->"+ image);
         break;
      case 30 :
        image.append(jjstrLiteralImages[30]);
        lengthOfMatch = jjstrLiteralImages[30].length();
                        System.out.println("Este ->"+ image);
         break;
      case 31 :
        image.append(jjstrLiteralImages[31]);
        lengthOfMatch = jjstrLiteralImages[31].length();
                        System.out.println("Nuevo -> "+ image);
         break;
      case 32 :
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
                         System.out.println("Negacion ->"+ image);
         break;
      case 33 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                 System.out.println("Identificador -> "+ image);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
