package com.example.games;

import com.example.games.R.id;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	public Button btnNewgame, btnExit, btnAbout, btnp1, btnCpu; // botoes utilizados

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  
        
        btnExit = (Button)findViewById(id.sair);
        btnNewgame = (Button)findViewById(id.newgame);
        btnp1 = (Button)findViewById(id.p1);
        btnCpu = (Button)findViewById(id.cpu);
        btnAbout = (Button)findViewById(id.about);
 
        
        // Atividades dos botoes
        
        btnExit.setOnClickListener(sair());
        btnp1.setOnClickListener(novatela()); 
        btnCpu.setOnClickListener(aicpu());
        btnAbout.setOnClickListener(about());
        
    }
    
    public View.OnClickListener sair() {
    	return new OnClickListener() {
    	public void onClick(View v) {
  
    		finish();
    		System.exit(0);
    	}
    	};
    }
    
    public View.OnClickListener novatela() {
    	return new OnClickListener() {
    	public void onClick(View v) {
    	
        	Intent startNewActivityOpen = new Intent(MainActivity.this, Atividade2.class);
        	startActivityForResult(startNewActivityOpen, 0);
    	
    	}
    	};
    }
    
    public View.OnClickListener aicpu() {
    	return new OnClickListener() {
    	public void onClick(View v) {
    	
        	Intent startNewActivityOpen = new Intent(MainActivity.this, Aicpu.class);
        	startActivityForResult(startNewActivityOpen, 0);
    	
    	}
    	};
    }
    
        
    public View.OnClickListener about() {
    	return new OnClickListener() {
    	public void onClick(View v) {
    	
        	Intent startNewActivityOpen = new Intent(MainActivity.this, About.class);
        	startActivityForResult(startNewActivityOpen, 0);
        	
    	}
    	};
    }    
}
