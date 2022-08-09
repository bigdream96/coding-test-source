from itertools import permutations


def solution(k, dungeons):
    answer = 0

    for v in list(permutations(dungeons)):
        answer = max(answer, search(k, v))

    return answer


def search(k, dungeons):
    answer = 0

    for i, v in enumerate(dungeons):
        if k >= v[0]:
            answer += 1
            k -= v[1]
        else:
            return answer

    return answer
