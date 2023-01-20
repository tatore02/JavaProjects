#include <stdio.h>

int main(){

  char *str[] = {"SPADA","DENARO","BASTONE","COPPA"};

  FILE *fp = fopen("listCard.txt","w");

  for(int j=0;j<4;j++){
    for(int i=1;i<11;i++){
      fprintf(fp,"%d %s\n",i,str[j]);
    }
  }

  fclose(fp);
}
