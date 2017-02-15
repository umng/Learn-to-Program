// C++ program to read an integer from STDIN and output it to STDOUT
#include <cstdio>
#include <iostream>
#include <algorithm>
#include <cmath>
#include <vector>
#include<queue>

using namespace std;

typedef struct tree{
    int data;
    tree *left;
    tree *right;
}tNode;

tNode* createNode(int data)
{
    tNode* node = new tNode();
    node -> data = data;
    node ->left = NULL;
    node -> right = NULL;
    return node;
}

tNode* createTree(tNode* root, int d, int a[], int n)
{
    std::queue<int> q;
    int t =0;

    for(int i=0; i<n; i++)
    {
        if(pow(2,t)-1 == i)
        {
            q.push(0);
            t++;
        }
        q.push(a[i]);
    }

    while(!q.empty())
    {
        cout<<q.front()<<endl;
        q.pop();
    }
    return NULL;
}


int main() {
    // Declare the variable
    int d, n, x, y, z;
    string s[7];

    // Read the variable from STDIN
    // cin >> d;
    d=3;

    int aN = pow(2,d+1)-1;
    int a[aN] = {2, 7, 5, 1, 6, -1, 9, -1, -1, 8, 11, -1, -1, 4, -1};
    // for(int i=0; i<aN; i++)
    //     cin >> a[i];

    // cin>>n;
    n = 7;

    // for(int i=0; i<n; i++)
    //     getline (cin, s[i]);


    //create a tree;
    tNode *root = NULL;
    createTree(root, d, a, aN);

    // Output the variable to STDOUT
    cout << endl << "OUTPUT";

    return 0;
}
