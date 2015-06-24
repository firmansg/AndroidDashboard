package firman.salatigadev.dashboard;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import firman.salatigadev.dashboard.R;

public class DashboardActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard_layout);
		
		/**
         * Membuat tombol kejadian
         * */
        // Dashboard Tombol berita
        Button btn_berita = (Button) findViewById(R.id.btn_berita);
         
        // Dashboard Tombol teman
        Button btn_teman = (Button) findViewById(R.id.btn_teman);
         
        // Dashboard Tombol pesan
        Button btn_pesan = (Button) findViewById(R.id.btn_pesan);
         
        // Dashboard Tombol tempat
        Button btn_tempat = (Button) findViewById(R.id.btn_tempat);
         
        // Dashboard Tombol acara
        Button btn_acara = (Button) findViewById(R.id.btn_acara);
         
        // Dashboard Tombol foto
        Button btn_foto = (Button) findViewById(R.id.btn_foto);
         
        /**
         * Menangani klik events pada tombol
         * */
         
        // Menangkap klik event tombol berita
        btn_berita.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View view) {
                // Menampilkan screen berita
                Intent i = new Intent(getApplicationContext(), BeritaActivity.class);
                startActivity(i);
            }
        });
         
       // Menangkap klik event tombol teman
        btn_teman.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View view) {
                // Menampilkan screen teman
                Intent i = new Intent(getApplicationContext(), TemanActivity.class);
                startActivity(i);
            }
        });
         
        // Menangkap klik event tombol pesan
        btn_pesan.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View view) {
                // Menampilkan screen pesan
                Intent i = new Intent(getApplicationContext(), PesanActivity.class);
                startActivity(i);
            }
        });
         
        // Menangkap klik event tombol tempat
        btn_tempat.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View view) {
                // Menampilkan screen tempat
                Intent i = new Intent(getApplicationContext(), TempatActivity.class);
                startActivity(i);
            }
        });
         
        // Menangkap klik event tombol acara
        btn_acara.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View view) {
                // Menampilkan screen acara
                Intent i = new Intent(getApplicationContext(), AcaraActivity.class);
                startActivity(i);
            }
        });
         
        // Menangkap klik event tombol foto
        btn_foto.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View view) {
                // Menampilkan screen foto
                Intent i = new Intent(getApplicationContext(), FotoActivity.class);
                startActivity(i);
            }
        });
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard, menu);
		return true;
	}

}
