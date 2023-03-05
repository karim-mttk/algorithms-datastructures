#basic code version 1
def convertTemperature(self, celsius: float) -> List[float]:
        l=[]
        l.insert(0, celsius *1.80 + 32.00 )
        l.insert(0, celsius + 273.15)
        return l

#version 2 with less code
def convertTemperature(self, celsius: float) -> List[float]:
    return [celsius + 273.15, celsius * 1.80 + 32.00]