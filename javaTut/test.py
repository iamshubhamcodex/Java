import pyautogui as pt 

def rept(s, t):
  pt.press(s, t)

def rep():
  pt.press("enter", _pause=False) # enter
  pt.press("tab", 5, _pause=False) # tab - 5
  pt.press("enter", _pause=False) # enter
  pt.keyDown("shift", _pause=False)
  pt.press("tab", 5, _pause=False)  # shift + tab - 5
  pt.keyUp("shift", _pause=False)
  pt.press("down", _pause=False)  # down

pt.press("tab", _pause=False) # tab - 2
pt.press("down", _pause=False) # down
rep()
rep()
# enter
# tab - 5
# enter
# shift + tab - 5
# down
pt.press("enter", _pause=False)  # enter
pt.press("tab", 8, _pause=False)  # tab - 8
pt.write("8210115031", _pause=False)  # 8210115031
pt.write("Adarsh Nagar", _pause=False)  # Adarh Nagar
pt.press("tab", 3, _pause=False)  # tab - 3
pt.write("843302", _pause=False)  # 843302
pt.press("tab", 3, _pause=False)  # tab - 3
pt.press("s", _pause=False)  # s 
pt.press("down", 3, _pause=False)  # down - 3
pt.press("tab", 5, _pause=False) # tab - 5
pt.press("down", 2, _pause=False)  # down - 2
pt.press("enter", _pause=False)  # enter
pt.press("tab", 3, _pause=False)  # tab - 3
pt.press("enter", _pause=False)  # enter
pt.press("tab", 2, _pause=False)  # tab - 2
pt.press("down", _pause=False)  # down
pt.press("tab", 2, _pause=False)  # tab - 2
pt.press("enter", _pause=False)  # enter

