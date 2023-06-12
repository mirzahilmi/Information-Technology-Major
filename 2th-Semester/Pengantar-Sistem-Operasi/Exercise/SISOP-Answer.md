## Question & Answer Structure

Q: Question or an Image of the question<br>
A: The Answer

> Do me a favor by following my GitHub and star this repository obviously 😒

---

![picture 2](https://i.imgur.com/agzqxrG.png)<br>
Akses Filesystem secara direct access biasanya digunakan pada storage ***disk*** yang cepat.Disk ini digunakan saat proses swapping standar which involves moving processes between memory and a backing store (disk).

![picture 4](https://i.imgur.com/mKiposL.png)<br>
Round robin merupakan algoritma scheduling yang membolehkan adanya interrupt selama berjalannya processes ***(Preemptive)*** untuk memungkinkan alokasi waktu untuk setiap proses.
   
![picture 5](https://i.imgur.com/57uofKH.png)  <br>
***Trashing***, karena dalam kondisi trashing, swap in/out terjadi secara berulang-ulang, bahkan lebih sering daripada eksekusi instruksi akibat dari kurangnya ketersediaan memory

![picture 7](https://i.imgur.com/f4aCvPA.png) <br>  
SJF (Shortest Job First) adalah metode scheduling yang memprioritaskan proses dengan burst time yang relatif sedikit / cepat. SJF sudah jarang digunakan / diimplementasikan karena akan ada sewaktu-waktu ***Prosess yang memiliki burst time lama tidak dapat dikerjakan jika proses dengan burst time lebih kecil datang terus menerus***

![picture 8](https://i.imgur.com/2kRhAX1.png) <br>
Resource Allocation Graph adalah strategi yang digunakan untuk mengalokasikan sumber daya sistem kepada proses yang membutuhkannya. Resource Allocation dapat mengurangi kemungkinan terjadinya deadlock, especially when ***beberapa proses meminta anggota dari sumber daya yang sama***

![picture 9](https://i.imgur.com/D5KlgdU.png)  <br>
***Safery Algorithm*** digunakan untuk melakukan pengecekan apakah suatu system is in a safe state.
> Mau tau maksudnya algoritma ini ngapain behind the scene? fine. So here, Let Work and Finish be vectors of length m and n, respectively. Initialize Work = Available and Finish[i] = false for i = 0, 1, 2, ..., n - 1

![picture 10](https://i.imgur.com/BjA1Azp.png)  
Logical Address atau Virtual Address adalah alamat yang dibuat oleh CPU selama runtime. Tujuan Logical Address adalah sebagai referensi untuk mengakses the physical address atau ***memetakan satu jenis alamat ke jenis alamat lain***

![picture 11](https://i.imgur.com/A0cYQJD.png)  
Ketika terdapat interupt yang terjadi, pada umumnya interupt bersifat urgent oleh karena itu hardware akan langsung ***Mengeksekusi interupt program***

![picture 12](https://i.imgur.com/moUBygw.png)  
Direct Access allow program to ***read/write secara random sesuai dengan record***. Direct Access Method is based on a disk model of a file, since disk allow random access to any file block

![picture 13](https://i.imgur.com/TdPLZV7.png)  
DMA (Direct Memory Access) tidak memerlukan CPU dalam mengeksekusikan proses thus it reduce CPU stress. After DMA finish it'll interrupt to CPU without signaling finish atau ***memberikan sinyal selesai***

![picture 14](https://i.imgur.com/hsCSs5Y.png)  
Its FIFO, First In First Out. Get it? so the answer is ***Proses pertama yang masuk akan dikerjakan***

![picture 15](https://i.imgur.com/TyfL2Tt.png)  
A processes generally also includes the process stack that is temporary data (function parameters, return addresses, and local variables), and a data section, which contain global variables. The answer should be ***Address space dan Global Variables***, but im not quite sure.

![picture 16](https://i.imgur.com/4rvvnzX.png)  
Sebuah process dalam sistem UNIX memiliki tanda pengenal yang di assign otomatis everytime a process created. Identitas ini adalah ***Process Identifier*** or an ID obviously.
