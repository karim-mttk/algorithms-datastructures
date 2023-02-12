def binary_search (lo, hi, condition):
	while lo <= hi:
		mid = (lo + hi) // 2
		result = condition(mid)
		if result == 'found':
			return mid
		elif result == 'left':
			hi = mid - 1
		else:
			lo = mid + 1
	return -1			

def locate_card(cards, query):
	
	def condition(mid):
		if cards[mid]==query:
			if mid > 0 and cards[mid -1]==query:
				return 'left'
		elif cards[mid] < query:
			return 'left'
		else: 
			return 'right'
			
	return binary_search(0, len(cards)-1, condition)				
			
			
cards = [0,1,3,4,6,7,9,10,12,14,16,20]
query = 9

locate_card(cards, query)			
