#include <iostream>
#include <vector>
#include <queue>
#include <stack>
#include <cstring>
#define MAX 100

using namespace std;

bool static visited[MAX]={false};

void bfs(std::vector<std::vector<int> > g, int first)
{
	queue<int> gq;
	gq.push(first);
	memset(visited, false, sizeof(bool)*MAX);

	int v;

	while(!gq.empty())
	{
		v = gq.front();
		gq.pop();

		if(visited[v] == true)
			continue;
		visited[v] = true;
		cout<<v<<" -- ";

		for (std::vector<int>::iterator iter = g[v].begin(); iter != g[v].end(); iter++)
		{
			if(visited[*iter] != true)
				gq.push(*iter);
		}
	}
}

void dfs(std::vector<std::vector<int> > g, int first)
{
	stack<int> GS;
	GS.push(first);
	memset(visited, false, sizeof(bool)*MAX);

	int v;

	while(!GS.empty())
	{
		v = GS.top();
		GS.pop();

		if(visited[v] == true)
			continue;
		visited[v] = true;
		cout<<v<<" -- ";

		for (std::vector<int>::iterator iter = g[v].begin(); iter != g[v].end(); iter++)
		{
			if(visited[*iter] != true)
				GS.push(*iter);
		}
	}
}

void _recDFS(std::vector<std::vector<int> > g, int v)
{
	visited[v] = true;
	cout<<v<<" -- ";

	for (int i = 0; i < g[v].size(); i++)
	{
		if(visited[g[v][i]] == false)
			_recDFS(g, g[v][i]);
	}

}

void recDFS(std::vector<std::vector<int> > g, int first)
{
	memset(visited, false, sizeof(bool)*MAX);
	_recDFS(g, first);
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

	cout<<endl<<"BFS:\t\t";
	bfs(graph, 1);
	cout<<endl<<"DFS:\t\t";
	dfs(graph, 1);
	cout<<endl<<"recDFS:\t\t";
	recDFS(graph, 1);

	return 0;
}