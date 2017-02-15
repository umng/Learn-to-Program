#include<stdio.h>

// #define N;

struct student 
{
	int age;
	char *name;
	int roll;
	char address[20];
};

int main(int argc, char const *argv[])
{
	struct student s[3];
	s[1].age = 10;
	s[1].name = "RS";
	printf("%d\n", s[1].age);
	printf("%s\n", s[1].name);
	return 0;
}