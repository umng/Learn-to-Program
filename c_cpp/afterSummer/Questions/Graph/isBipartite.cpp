#include <iostream>
#include <vector>
#include <queue>
#include <stack>
#include <cstring>
#define MAX 100

using namespace std;

bool static visited[MAX]={false};

int callCheckBipartite(std::vector<std::vector<int> > g, int color[], int n)
{
	visited[n] = true;

	for (std::vector<int>::iterator iter = g[n].begin(); iter != g[n].end(); iter++)
	{
		if(visited[*iter] && color[n] == color[*iter])
			return 0;
		if(visited[*iter] == false)
		{
			color[*iter] = (color[n] ? 0 : 1);
			if(callCheckBipartite(g, color, *iter) == 0)
				return 0;
		}
	}
	return 1;
}

int isBiPartite(std::vector<std::vector<int> > g, int n)
{

	memset(visited, false, sizeof(bool)*MAX);
	int *color = new int(n);
	memset(color, -1, sizeof(int)*MAX);

	for (int i = 0; i < n; i++)
	{
		if(visited[i] == false)
			if(callCheckBipartite(g, color, i) == 0)
				return 0;
	}
	return 1;
}

int main(int argc, char const *argv[])
{
	int n=10;

	int color[MAX]={-1};

	std::vector<std::vector<int> > graph;

	graph.resize(10);
	graph[1].push_back(2);
	graph[1].push_back(3);
	graph[3].push_back(6);
	graph[2].push_back(4);
	graph[2].push_back(5);
	graph[5].push_back(7);
	graph[5].push_back(8);
	graph[5].push_back(9);

	cout<<endl;
	isBiPartite(graph, 1) ? cout<<"True" : cout<<"False";

	return 0;
}