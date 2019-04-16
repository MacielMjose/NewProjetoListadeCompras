package com.example.newprojetolistadecompras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.newprojetolistadecompras.JavaClasses.Produto;

import java.util.List;

public class AdapterProduto extends BaseAdapter {

    private Context context;
    private List<Produto> lista;
    private LayoutInflater inflater;

    public AdapterProduto(Context context, List<Produto> lista){

        this.context = context;
        this.lista = lista;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lista.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Suporte item;

        if( convertView == null ){
            convertView = inflater.inflate
                    (R.layout.activity_main, null);
            item = new Suporte();
            item.tvCodigo = (TextView)
                    convertView.findViewById(R.id.addLista);
            item.tvTitulo = (TextView)
                    convertView.findViewById(R.id.addQtd);
            item.tvTexto = (TextView)
                    convertView.findViewById(R.id.addPreco);

            convertView.setTag(item);
        }else {
            item = (Suporte) convertView.getTag();
        }

        Produto nota = lista.get( position );
        item.tvCodigo.setText( String.valueOf( nota.getId() ) );
        item.tvTitulo.setText(  nota.getId()  );
        item.tvTexto.setText(  nota.getNome()  );



        return convertView;
    }

    private class Suporte{

        TextView tvCodigo, tvTitulo, tvTexto;
    }

}










