def timeConversion(s):
    if s[-2:] == 'AM':
        s = s.replace('AM', "")
        if s[:2] == '12':
            s = s.replace(s[:2], '00')
    else:
        s = s.replace('PM', "")
        if int(s[:2]) < 12:
            s = s.replace(s[:2], str(int(s[:2]) + 12))
    return s
