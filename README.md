# Encryption

//2020-09-23

这是闲时写的一个加密工具箱，是基于java语言实现的。<br>
目前仅实现了凯撒密码的控制台加解密和图形界面加解密。

控制台的凯撒密码实现分为加密和解密，分别实现了广义上的凯撒密码和狭义上的密码。<br>
广义上的凯撒密码是针对整个ASCII集，因此加密使用的加法，解密使用的减法。<br>
狭义上的凯撒密码就是传统意义上的凯撒密码，仅针对26的英文字母的大小写进行加密。<br>
狭义上的凯撒密码中的加密采用加法实现，解密采用减法实现，但解密也可以采用周期的余数进行加法实现。

图形界面的凯撒密码是实现的狭义上的凯撒密码，因为狭义上的凯撒密码更有实际意义。
