    void main() { //short form of     public static void main (String args[]){ 

        String str = "{{})"; // input string
        char[] arr =  new char[str.length()]; // arrey that will be writen and readen. Its lenght is lenght of str so there is no memorie problem
        // as long str is "static", not inputed by user it no point make it dynamic. 
        
        /*
        if (str.length() == 0) {
            return;
            //its empty, no need to check. 
            //I found out it only made of[{()}] so no need to check... damn
        }   
        */

        if ( (str.charAt(0) == '[' || str.charAt(0) == '(' || str.charAt(0) == '{') && str.length() % 2 == 0) {
            //nothing. good
        } else {
            System.out.println(false);
            return; 
            /*
            point of check if it
            1) Has no opening thing
            2) Doesnt even have enough closing or opening things
            */
        }

        int HowMannyOpenning = 0;
        for (int i = 0; i < str.length(); i++ ) {
            char CurrentThing = str.charAt(i); // extracting array
            if (CurrentThing == '(' || CurrentThing == '[' || CurrentThing == '{') { //seems " " and ' ' different, ask teacher later. Or google. "" - string. ''- char
            arr[HowMannyOpenning] = CurrentThing; //writin in array opening things    
            HowMannyOpenning++;
            } else {
                HowMannyOpenning--;
                char lastOpening = arr[HowMannyOpenning];
                if (CurrentThing == ')' && lastOpening != '(' || CurrentThing == ']' && lastOpening != '[' || CurrentThing == '}' && lastOpening != '{') { //Self explenatory
                    System.out.println(false); 
                    return;
                }
        } 
        
    }
    if (HowMannyOpenning == 0) {System.out.println(true); // Just in case
    }
    }
    //
