package com.cowok.hijrah.chapter4topic2.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.cowok.hijrah.chapter4topic2.R
import com.cowok.hijrah.chapter4topic2.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {
    lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_news)

        var listNews = arrayListOf(
            News(
                "Pertalite Masih Lebih Banyak Dinikmati Masyarakat Mampu",
                "15 Sep 2022",
                R.drawable.pertalite,
                "Kebijakan subsidi bahan bakar minyak (BBM) selama ini terbukti tidak efektif " +
                        "dalam menurunkan angka kemiskinan, karena prakteknya yang salah sasaran. " +
                        "Contohnya BBM subsidi jenis Pertalite yang ternyata masih lebih banyak " +
                        "dinikmati oleh masyarakat mampu atau orang-orang kaya.\nHal ini diungkapkan " +
                        "oleh Direktur Eksekutif Reforminer Institute, Komaidi Notonegoro saat menjadi " +
                        "pembicara dalam diskusi bertajuk 'Mengurai Polemik Kenaikan BBM Bersubsidi' " +
                        "yang diselenggarakan Dewan Pimpinan Pusat (DPP) Gerakan Mahasiswa Nasional " +
                        "Indonesia (GMNI) di Jakarta, Rabu 14 September 2022.\nDalam kesempatan itu, " +
                        "Komaidi mengurai data yang diperoleh lembaganya bahwa sepanjang 2022 " +
                        "pemerintah telah menganggarkan subsidi energi yang amat besar, mencapai Rp. " +
                        "502 triliun. Namun sayangnya, dana sebesar itu lebih banyak habis untuk " +
                        "mensubsidi BBM yang 80 persennya dinikmati masyarakat mampu.\nDia mencontohkan " +
                        "pada BBM subsidi jenis Pertalite, yang sebanyak 70 persen atau 20,3 juta " +
                        "Kiloliter (KL) per tahun, dikonsumsi oleh kendaraan roda empat. Sedangkan " +
                        "kendaraan roda dua hanya menggunakan sebanyak 8,7 juta KL per tahun, atau " +
                        "sekitar 30 persen. Rata-rata konsumsi BBM kendaraan roda dua hanya 2,5 liter " +
                        "sekali transaksi, sedangkan roda empat mencapai 23,5 liter sekali transaksi.\n" +
                        "'Kalau roda empat yang mengkonsumsi Pertalite itu angkutan umum kita bisa " +
                        "terima. Karena masyarakat bawah yang tidak punya mobil naik angkutan umum. " +
                        "Tapi faktanya dari 20,3 juta KL konsumsi roda empat itu, sebagian besar atau " +
                        "98,7 persennya adalah mobil pribadi. Angkutan umum hanya 0,4 persen, taksi " +
                        "online 0,6 persen, dan taksi 0,3 persen. Yang punya mobil pribadi kan orang " +
                        "mampu.' ujar Komaidi.",
                "Maulandy Rizky Bayu Kencana"
            ),
            News(
                "Arab Saudi Segera Umumkan Diri Jadi Tuan Rumah Piala Dunia 2030",
                "10 Sep 2022",
                R.drawable.piala_dunia,
                "Arab Saudi mencalonkan diri sebagai tuan rumah Piala Dunia 2030. Meski masih " +
                        "jadi perdebatan, kabarnya FIFA sudah memberi lampu hijau!\nPiala Dunia 2022 " +
                        "berlangsung di Qatar pada akhir tahun ini. Selanjutnya Piala Dunia 2026 akan " +
                        "digelar di benua Amerika yang tersebar di AS, Kanada, dan Meksiko.\nThe Times " +
                        "melaporkan, Arab Saudi sudah maju jadi calon tuan rumah Piala Dunia 2030. Arab " +
                        "Saudi akan bersama-sama jadi tuan rumah bersama Mesir dan Yunani.\nMereka " +
                        "bertiga bersaing dengan beberapa negara di Eropa (salah satunya duet Portugal " +
                        "dan Spanyol). Kabarnya, FIFA sudah memberi lampu hijau kepada Arab Saudi cs.\n" +
                        "Dikabarkan, tak lama lagi Arab Saudi akan meresmikan diri sebagai tuan rumah " +
                        "Piala Dunia 2023. Akan tetapi, muncul perdebatan terkait hal itu.\nPertama " +
                        "adalah, ajang Piala Dunia 2030 diyakini akan seperti di tahun 2022 ini yang " +
                        "digelar di musim dingin. Itu karena, musim panas di kawasan Timur Tengah akan " +
                        "menyulitkan para pemain. Maka, bisa jadi jadwal kompetisi sepakbola Eropa dan " +
                        "dunia lebih padat lagi.\nKedua adalah permasalahan isu HAM. Berbagai kebijakan " +
                        "hukum di Arab Saudi jadi catatan hitam pelanggaran HAM, termasuk pembunuhan " +
                        "wartawan Jamal Khashoggi di tahun 2018 yang masih dinilai jadi misteri.\nAkan " +
                        "tetapi, Arab Saudi dinilai sudah sukses menggelar ajang olahraga kelas dunia. " +
                        "Sebut saja seperti pertarungan tinju hingga ajang F1.\nArab Saudi memang " +
                        "sedang melepas ketergantungan dari minyak sebagai devisa negara. Kawasan-" +
                        "kawasan selain dua kota suci (Makkah dan Madinah) disulap menjadi kawasan " +
                        "wisata dan menyelenggarakan festival sampai ajang olahraga taraf internasional.",
                "Afif Farhan"
            ),
            News(
                "Pemakaman Ratu Elizabeth II Lebih Dahsyat dari Olimpiade London 2012",
                "15 Sep 2022",
                R.drawable.ratu_elizabet,
                "Operator transportasi London harus mengakomodir semua orang yang ingin memberi " +
                        "penghormatan pada mendiang Ratu Elizabeth II. Ini lebih sulit daripada Olimpiade " +
                        "2012.\nHal itu diungkapkan operator kereta api, Rail Delivery Group. Mereka " +
                        "bilang, pemesanan tiket kereta api yang sangat tinggi karena Ratu Elizabeth II " +
                        "wafat, belum pernah terjadi sebelumnya.\nTak hanya itu, bos Transport for London " +
                        "Andy Byford mengatakan pihaknya menghadapi acara dan tantangan terbesar. ''Saya " +
                        "pikir ini lebih sulit daripada Olimpiade,'' katanya dilansir dari The Sun, " +
                        "Kamis (15/9/2022).\n''Saat acara olahraga, Anda tahu ke mana dan berapa banyak " +
                        "orang akan datang. Tetapi acara seperti ini, ada lebih banyak hal yang tidak " +
                        "diketahui'', ujarnya.\nSementara itu Network Rail berjanji akan menjalankan " +
                        "layanan sepanjang malam di rute tertentu. Mereka juga menyiapkan kereta tambahan " +
                        "pada hari Senin mendatang untuk pemakaman Ratu Elizabeth II.",
                "Putu Intan"
            ),
            News(
                "Fenomena Keburukan dan Fitnah Akhir Zaman",
                "18 Jun 2022",
                R.drawable.akhir_zaman,
                "Akhir zaman akan diikuti oleh kemunculan atau fenomena suasana-suasana keburukan " +
                        "yang melanda dunia. Karena itu, umat Islam diwajibkan selalu berdoa kepada Allah " +
                        "‘azza wa jalla dan senantiasa meminta perlindungan kepada-Nya dalam menghadapi " +
                        "fitnah akhir zaman. Rasulullah Shallallahu alaihi wa sallam pun selalu memohon " +
                        "perlindungan kepada Allah dan memerintahkan umatnya mengerjakannya.\nSebuah " +
                        "riwayat dari Abu Hurairah radhiyallahu ‘anhu, dia mengatakan: “Rasulullah " +
                        "Shallallahu alaihi wa sallam berdoa, ‘Ya Allah aku meminta perlindungan padamu " +
                        "dari azab kubur, dan dari azab neraka dan dari fitnah kehidupan dan fitnah " +
                        "kematian dan dari fitnah al-Masih Dajjal.”(HR. Al-Bukhari)\nDalam buku Misteri " +
                        "Zikir Akhir Zaman karangan Abu Fatiyah Al-Adnani juga dijelaskan bahwa " +
                        "pentingnya doa untuk menghadapi fitnah akhir zaman. Karena Akhir zaman kondisinya " +
                        "sangat buruk.\nBanyak sekali penjelasan Rasulullah tentang akhir zaman ini. " +
                        "Rasulullah shallallahu ‘alaihi wa sallam bersabda :\n“Tidaklah datang kepada " +
                        "kalian suatu hari atau suatu zaman melainkan sesudahnya lebih buruk dari " +
                        "sebelumnya, hingga kalian berjumpa dengan Rabb kalian.” (HR. Ibnu Hibban, Shahih " +
                        "Al-Bukhari).\nUstaz Abu Fatiyah Al-Adnani juga mengutip hadis bahwa Rasulullah " +
                        "berdoa dan meminta kepada Allah agar menggerakkan hati pada ketaatan saat " +
                        "datangnya fitnah akhir zaman.\nRasulullah Shalallahu 'alaihi wa Salam bersabda " +
                        "yang artinya : \"Ya Allah, Dzat yang menggerakkan hati, gerakkanlah hatiku kepada " +
                        "Ketaatan kepada-MU.\" (HR. Muslim).\nMemang kita harus berlindung pada ketaatan. " +
                        "Karena akan menghadapi banyak keanehan di akhir zaman. Banyak terjadi di " +
                        "masyarakat, banyak rumah semakin besar, tapi keharmonisan keluarga semakin kecil. " +
                        "Banyak gelar semakin panjang, tapi umur semakin pendek.\nBanyak makanan dan " +
                        "minuman semakin bermacam-macam, tapi yang halal menjadi samar bahkan aneh. Harga " +
                        "barang-barang semakin mahal, tapi harga diri semakin murah.\nJumlah Manusia " +
                        "semakin banyak, tapi sifat kemanusiaan semakin sedikit. Banyak wajah semakin " +
                        "cantik, tapi akhlak semakin buruk. Banyak orang menikah semakin sulit, tapi " +
                        "orang berzina semakin mudah. Banyak orang tersenyum di depan kamera, Tapi angkuh " +
                        "di depan mata.\nBanyak teman di sosial media semakin dekat, tapi hubungan dengan " +
                        "saudara semakin jauh. Banyak orang semakin kaya, tapi iman semakin miskin. " +
                        "Perselingkuhan dan pacaran semakin marak, kesetiaan semakin langka. Pendidikan " +
                        "semakin tinggi, tapi kejujuran semakin Rendah.\nBanyak gedung-gedung bertingkat " +
                        "berdiri, tapi rasa keadilan semakin roboh. Tekhnologi semakin maju, Tapi " +
                        "kesopanan semakin mundur. Banyak para tokoh, biduan dan artis semakin terkenal, " +
                        "tapi orang yang beriman semakin terasing.\nInilah zaman di mana dunia akan semakin " +
                        "aneh. Yang benar dianggap salah, yang putih dianggap hitam. Yang baik dianggap " +
                        "buruk, dan yang Jujur dianggap pembohong.\nSebuah hadis menyebutkan : \"Hari " +
                        "kiamat tidak akan terjadi hingga orang yang dapat dipercayai didustakan, sedangkan " +
                        "orang-orang yang berkhianat justru dipercaya, kemesuman dan kata-kata kotor " +
                        "merupakan fenomena umum di tengah masyarakat, terputusnya tali silaturahim, dan " +
                        "hubungan bertetangga yang buruk (HR. Ahmad, shahih).\nBegitulah fenomena akhir " +
                        "zaman. Ketika nafsu dan syahwat mendominasi, orang semakin jauh dari ajaran dan " +
                        "syariat agama. Hubungan dan interaksi semata hanya bermotif duniawi. Jauh dari " +
                        "tuntunan dari Allah Subhanahu wa Ta'ala.\nWallahu A'lam.",
                "Widaningsih"
            ),
            News(
                "5 Perkara yang Harus Disiapkan Menghadapi Fitnah Akhir Zaman",
                "05 Sep 2022",
                R.drawable.hadapi_fitnah,
                "Hidup manusia saat ini telah berada di akhir zaman , dan sudah dekat dengan " +
                        "waktu hari kiamat. Rasulullah Shallallahu ‘Alaihi wa sallam telah menjelaskan " +
                        "dalam sejumlah hadisnya tentang dekatnya dengan hari kiamat ini. Walaupun, kapan " +
                        "akan hari kiamat, seberapa lama lagi hari kiamat, itu adalah ilmu yang dirahasiakan " +
                        "di sisi Allah Subhanahu wa Ta’ala.\nTetapi Baginda Nabi Shallallahu ‘Alaihi wa " +
                        "Sallam telah mengisyaratkan tentang dekatnya hari kiamat. Sebagaimana dinyatakan " +
                        "dalam sebuah hadis:\n“Jarak diutusnya aku dan hari kiamat seperti dua (jari) ini.” " +
                        "Beliau memberikan isyarat dengan kedua jarinya (jari telunjuk dan jari tengah), " +
                        "lalu merenggangkannya. (HR. Bukhari)\n\nLantas bagaimana kita harus menghadapi " +
                        "ujian dan fitnah akhir zaman ini? Dai yang rutin mengisi kajian dakwah sunnah ini " +
                        "menjelaskan sebagai berikut:\n1. Mencari ilmu\nSemua problem berkaitan dengan " +
                        "fitnah, jalannya ilmu Hiruk-pikuk fitnah dunia hari ini, maka mesti setiap mukmin " +
                        "menjadikan bagian dari hidupnya adalah untuk mencari ilmu. Karena ilmu adalah " +
                        "bagian terpenting dalam hidup kita.\n2. Menyiapkan kehidupan masa depan (setelah " +
                        "kematian)\nKehidupan setelah kematian kita adalah masa depan yang paling depan. " +
                        "Jika para ibu dan para bapak berbicara tentang masa depan, maka inilah masa depan " +
                        "yang sesungguhnya. Oleh sebab itu Al-Qur’an mengajarkan kisah seorang Nabi yang " +
                        "mengajarkan masa depan kepada anaknya, yaitu Nabi Ya’qub ‘Alaihis Salam. Ketika " +
                        "beliau sedang dalam keadaan dekat kepada kematian, sedang sakaratul mau, maka " +
                        "mengumpulkan semua anaknya.\n3. Menjaga amal\nKetika kita bertanya tentang amal " +
                        "dan ketika kita meminta ditunjukkan kepada seorang alim tentang amal dimasa hari " +
                        "ini, maka ada jawaban yang sederhana dari sekian penjelasan. Lakukanlah amal yang " +
                        "mampu kita mendawamkannya setelah kita menunaikan perkara-perkara yang fardhu " +
                        "(wajib). Menjaga shalat lima waktu, menjaga puasa dan menjaga setiap perkara yang " +
                        "Allah Ta’ala fardhu-kan.\n4.Berkata benar\nKewajiban mukmin adalah benar dalam " +
                        "berkata, benar dalam bercakap, benar dalam berucap dan benar dalam beramal. " +
                        "Fitnah terbesar pada hari ini adalah melihat berbagai kedzaliman. Mungkin di " +
                        "berbagai negara rakyat mencium bau kedzaliman dari para pemimpinnya. Di sisi " +
                        "lain, kita pun melihat begitu dahsyatnya rekayasa musuh kepada kaum muslimin dan " +
                        "rekayasa musuh terhadap Islam. Dan kita seorang muslim yang punya ghiroh iman " +
                        "pasti ingin melakukan sesuatu, melawan terhadap semua kedzaliman ini, melawan " +
                        "setiap keburukan ini.\n5. Solusi ketika iman sedang turun\nNabi Shallallahu " +
                        "‘Alaihi wa Sallam mengatakan bahwa di antara hiruk-pikuk kehidupan dalam fitnah, " +
                        "maka kita akan sering mendapatkan ujian yang menyebabkan kita lemah. Dan Nabi " +
                        "Shallallahu ‘Alaihi wa Sallam pun telah mengisyaratkan:\n“Dalam setiap kondisi " +
                        "semangat, akan datang masa yang lemah. Maka barangsiapa yang melemahnya kepada " +
                        "sunnahku, maka ia akan selamat. Dan barangsiapa yang dalam kondisi lemahnya " +
                        "kepada selain sunnah, maka dia akan celaka.” (HR. Ibnu Hibban)\nWallahu A'lam",
                "Widaningsih"
            )
        )

        binding.rvNews.adapter = NewsAdapter(listNews)
        binding.rvNews.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.VERTICAL, false
        )

    }
}