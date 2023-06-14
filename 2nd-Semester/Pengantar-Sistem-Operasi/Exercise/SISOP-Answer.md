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

![picture 17](https://i.imgur.com/elUdblT.png)  
The answer is ***ls***. Stand for List, and it's a command you usually execute in shell, bash, cmd, or even powershell buat nampilin semua file / folder yang ada didalam suatu directory. *touch* is for updating a file last_edited, *dir* do the same as ls but its native on windows, *mkdir* for create a new folder (it's stand for make directory, now you get it huh), and last *lsdir*, this isn't a real command, just a trap answer 

![picture 18](https://i.imgur.com/rO1lBXg.png)  
One way Circular Wait to ensure that this condition never holds is to impose a total ordering of all resource types and to require that each process requests resources in an increasing order of enumeration. So then the answer should be ***Memberlakukan pemesanan terlebih dahulu untuk total jenis resource yang dibutuhkan dan setiap proses meminta resource sesuai urutan nomor***

![picture 19](https://i.imgur.com/3SwxK6h.png)  
Deadlock adalah kondisi dimana sebuah process terpaksa menunggu sebuah prosess lain karena sumber daya yang ingin dipakai sedang digunakan oleh proses lain. Setelah proses tersebut selesai, proses yang sebelumnya tertahan akan langsung memasuki fase ***no preemption***.

![picture 20](https://i.imgur.com/cqImwao.png)  
Setelah proses **Blocked State** selesai, proses akan memasuki fase ***Ready State***.

![picture 22](https://i.imgur.com/rA2ThIX.png)  
Jawabannya adalah ***drwxr-----***. Let's break it down, totalnya ada 10 slot pada untuk keterangan permission suatu file/directory di unix. d berarti directory, r berarti akses read, w untuk write, dan x untuk execute. Permission read memiliki nilai sebesar 4, write 2, dan execute 1. Oleh karena itu pattern permission yang cocok untuk 7 4 0 adalah ***drwxr-----***

![picture 24](https://i.imgur.com/WjtSPWC.png)
Blok 2 3 4 5 8 9 10 dengan sisa bloknya teralokasikan, maka untuk menentukan freespace bitmap cukup dengan menandai angka diluar blok dengan angka 0 yang berarti false. Jawabannya adalah ***0111100111***

![picture 26](https://i.imgur.com/bQ9BpYy.png)
The actual algorithm of Preemptive Priority Scheduling itu kaya gini
1. Step-1: Select the first process whose arrival time will be 0, we need to select that process because that process is only executing at time t=0.
2. Step-2: Check the priority of the next available process. Here we need to check for 3 conditions.
- if priority(current_process) > priority(prior_process) :- then execute the current process.
- if priority(current_process) < priority(prior_process) :- then execute the prior process.
- if priority(current_process) = priority(prior_process) :- then execute the process which arrives first i.e., arrival time should be first.

3. Step-3: Repeat Step-2 until it reaches the final process.
4. Step-4: When it reaches the final process, choose the process which is having the highest priority & execute it. Repeat the same step until all processes complete their execution.

Dari algoritma diatas, kita bisa mensimulasikan algoritma Preemptive Priority Scheduling diatas kertas, hasilnya adalah ***P1 -> P2 -> P1 -> P5 -> P1 -> P3 -> P4 -> ...dst***
![picture 27](https://i.imgur.com/WwQhdwW.png)  
![picture 28](https://i.imgur.com/GCjj9BI.png)  
![picture 29](https://i.imgur.com/rKQhytO.png)  
![picture 30](https://i.imgur.com/j6qoK3Y.png)  
![picture 31](https://i.imgur.com/MbEpEVt.png)  
![picture 32](https://i.imgur.com/Yt5g7Vl.png)  
![picture 33](https://i.imgur.com/QhXlrT3.png)  
![picture 34](https://i.imgur.com/NkHSXkw.png)  
![picture 35](https://i.imgur.com/bcpTPXv.png)  
![picture 36](https://i.imgur.com/gEOwkpc.png)  
![picture 37](https://i.imgur.com/LjYtV5D.png)  
![picture 38](https://i.imgur.com/EL4WYQG.png)  
![picture 39](https://i.imgur.com/WLbI0wU.png)  
![picture 40](https://i.imgur.com/Wq5t9gA.png)  
![picture 41](https://i.imgur.com/ATjixin.png)  
![picture 42](https://i.imgur.com/clGbWMC.png)  
![picture 43](https://i.imgur.com/tvHhX2O.png)  
![picture 44](https://i.imgur.com/vjVKR6j.png)  
![picture 45](https://i.imgur.com/9psNOoC.png)  
![picture 46](https://i.imgur.com/jdcczAJ.png)  
![picture 47](https://i.imgur.com/csgkeRj.png)  
![picture 48](https://i.imgur.com/XCx3Enc.png)  
![picture 49](https://i.imgur.com/s5GsJiF.png)  
Parameter dari kode tersebut ditunjukkan pada fungsi malloc() yang digunakan itu mengalokasikan memori secara dinamis. Memori ini nantinya disimpan pada heap. Jadi jawaban yang tepat adalah ***(int \*)malloc(sizeof(int)\*5), heap***
![picture 50](https://i.imgur.com/ywD1LUO.png)  
![picture 51](https://i.imgur.com/dYZkJ4n.png)  
![picture 52](https://i.imgur.com/yXf6rqc.png) 
![picture 53](https://i.imgur.com/nJY585Z.png)  
![picture 54](https://i.imgur.com/iZZF7h5.png)  
![picture 55](https://i.imgur.com/IPYd62H.png)  
![picture 56](https://i.imgur.com/6IEX5mh.png)  
![picture 57](https://i.imgur.com/BB5Se0w.png)  
![picture 58](https://i.imgur.com/xAHbqGt.png)  
![picture 59](https://i.imgur.com/YNffttm.png)  
![picture 60](https://i.imgur.com/CQtqM1s.png)  
![picture 61](https://i.imgur.com/6Upv73n.png)  
![picture 62](https://i.imgur.com/lvSBoY5.png)  
![picture 63](https://i.imgur.com/c4C6Ssz.png)  
![picture 64](https://i.imgur.com/D1G04V5.png)  
![picture 65](https://i.imgur.com/A8bO1kQ.png)  
![picture 66](https://i.imgur.com/wjYKpOg.png)  
![picture 67](https://i.imgur.com/YAJolix.png)  
![picture 68](https://i.imgur.com/YurBnoX.png)  
![picture 69](https://i.imgur.com/KYcSRLA.png)  
![picture 70](https://i.imgur.com/kA9HoIE.png)  
![picture 71](https://i.imgur.com/uRJFU7Y.png)  
![picture 72](https://i.imgur.com/XE1o3UQ.png)  

