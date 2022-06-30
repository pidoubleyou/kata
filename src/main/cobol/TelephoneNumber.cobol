identification division.
program-id. CreatePhoneNumber.
data division.

linkage section.
01  arr    pic 9(10).
01  result pic x(14).

procedure division using arr result.

  STRING '('
    arr(1:3)
    ') '
    arr(4:3)
    '-'
    arr(7:4)
    INTO result
    ON OVERFLOW DISPLAY 'OVERFLOW!'
  END-STRING.

  goback.
end program CreatePhoneNumber.
