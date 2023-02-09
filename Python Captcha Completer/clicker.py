import pyautogui as p
import time

amount = int(input("Enter amount of times: "))

#amount = 10

for x in range(amount):
    e = p.locateCenterOnScreen("5.png",confidence=.9)
    #print(e)
    p.moveTo(e)
    p.click()
    p.moveTo(1064, 780)
    p.click()
    #print(x)
    #time.sleep(0.5)

print('done!')


#e = p.locateCenterOnScreen("5.png",confidence=.8)
#print(e)
#p.moveTo(e)
#p.click()
