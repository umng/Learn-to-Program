#include <iostream>
#include <vector>
#include <queue>
#include <stack>
#include <cstring>
#define MAX 100

using namespace std;

bool static visited[MAX]={false};
bool static currPath[MAX]={false};

int _detectCycleInGraph(std::vector<std::vector<int> > g, int v)
{
	visited[v] = true;
	// cout<<v<<" -- ";
	
	currPath[v] = true;

	for (std::vector<int>::iterator iter = g[v].begin(); iter != g[v].end(); iter++)
	{
		if(visited[g[v][*iter]] == false)
		{
			if(_detectCycleInGraph(g, g[v][*iter]) == 1)
			{
				cout<<v<<"\t";
				return 1;
			}
		}
		else if(currPath[*iter])
		{
			cout<<v<<"\t";
			return 1;
		}
	}

	currPath[v] = false;
	return 0;
}

void detectCycleInGraph(std::vector<std::vector<int> > g, int first)
{
	memset(visited, false, sizeof(bool)*MAX);
	_detectCycleInGraph(g, first);
}

int main(int argc, char const *argv[])
{
	int n=10;

	int color[MAX]={-1};

	std::vector<std::vector<int> > graph;

	graph.resize(10);
	// graph[1].push_back(2);
	// graph[1].push_back(3);
	// graph[3].push_back(6);
	// graph[2].push_back(4);
	// graph[2].push_back(5);
	// graph[5].push_back(7);
	// graph[5].push_back(8);
	// graph[5].push_back(9);
	graph[0].push_back(1);
	graph[0].push_back(2);
	graph[1].push_back(2);
	graph[2].push_back(0);
	graph[2].push_back(3);
	graph[3].push_back(3);

	cout<<endl;
	detectCycleInGraph(graph, 1);

	return 0;
}