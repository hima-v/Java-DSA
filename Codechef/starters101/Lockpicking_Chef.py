def min_moves_to_open_lock(S,K,N,M):
    min_moves = float('inf')
    for i in range(N - M + 1):
        substring = S[i:i+M]
        moves = sum(min(abs(int(substring[j]) - int(K[j])), 10 - abs(int(substring[j]) - int(K[j]))) for j in range(M))
        min_moves = min(min_moves, moves)
    return min_moves
T = int(input())
results = []
for _ in range(T):
    N, M = map(int, input().split())
    S = input()
    K = input()
    result = min_moves_to_open_lock(S,K,N,M)
    print(result)