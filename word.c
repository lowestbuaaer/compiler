#include<stdio.h>
#include<string.h>


int is_letter(char chr){
    if((chr>='a'&&chr<='z')||(chr>='A'&&chr<='Z'))
    return 1;
    else
    return 0;
}


int is_digit(char chr){
    if(chr>='0'&&chr<='9')
    return 1;
    else
    return 0;
}


int is_underline(char chr){
    if(chr =='_')
    return 1;
    else
    return 0;
}


int is_nondigit(char chr){
    if(is_letter(chr)||is_underline(chr))
    return 1;
    else
    return 0;
}


int main(int argc, char *argv[]){
    char file_name[100];
    strcpy(file_name,argv[1]);
    FILE *fptr;
    fptr=fopen(file_name,"r");
    int lenth,index;
    char storage[1000];
    while(fgets(storage,1000,fptr)!=NULL){
        lenth=strlen(storage);
        index=0;
        while(index<lenth){
            if(storage[index]==';'){
                printf("Semicolon\n");
            }
            else if(storage[index]=='('){
                printf("LPar\n");
            }
            else if(storage[index]==')'){
                printf("RPar\n");
            }
            else if(storage[index]=='{'){
                printf("LBrace\n");
            }
            else if(storage[index]=='}'){
                printf("RBrace\n");
            }
            else if(storage[index]=='+'){
                printf("Plus\n");
            }
            else if(storage[index]=='*'){
                printf("Mult\n");
            }
            else if(storage[index]=='/'){
                printf("Div\n");
            }
            else if(storage[index]=='<'){
                printf("Lt\n");
            }
            else if(storage[index]=='>'){
                printf("Gt\n");
            }
            else if(storage[index]=='='){
                if(storage[index+1]=='='){
                    printf("Eq\n");
                    index++;
                }
                else
                    printf("Assign\n");
            }
            else if(is_digit(storage[index])){
                char identity[100];
                for(int i=0;i<100;i++){
                    identity[i]='\0';
                }
                int inn_index=0;
                identity[inn_index]=storage[index];
                while(is_digit(storage[++index])){
                    identity[++inn_index]=storage[index];
                }
                index--;
                printf("Number(%s)\n",identity);
            }
            else if(is_nondigit(storage[index])){
                char identity[100];
                for(int i=0;i<100;i++){
                    identity[i]='\0';
                }
                int inn_index=0;
                identity[inn_index]=storage[index];
                while(is_digit(storage[++index])||is_nondigit(storage[index])){
                    identity[++inn_index]=storage[index];
                    if(strcmp(identity,"if")==0){
                        printf("If\n");
                        break;
                    }
                    else if(strcmp(identity,"else")==0){
                        printf("Else\n");
                        break;
                    }
                    else if(strcmp(identity,"while")==0){
                        printf("While\n");
                        break;
                    }
                    else if(strcmp(identity,"break")==0){
                        printf("Break\n");
                        break;
                    }
                    else if(strcmp(identity,"continue")==0){
                        printf("Continue\n");
                        break;
                    }
                    else if(strcmp(identity,"return")==0){
                        printf("Return\n");
                        break;
                    }
                }
                printf("Ident(%s)\n",identity);
            }
            else if(storage[index]==' '||storage[index]=='\t'||storage[index]=='\r'||storage[index]=='\n'){

            }
            else{
                printf("Err\n");
                return 0;
            }
            index++;
        }
    }
    return 0;
}
