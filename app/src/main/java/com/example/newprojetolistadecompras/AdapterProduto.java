package com.example.newprojetolistadecompras;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
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
                    (R.layout.layout_lista_produtos, null);
            item = new Suporte();
            item.tvCodigo = (TextView)
                    convertView.findViewById(R.id.tvListaCodigo);
            item.tvTitulo = (TextView)
                    convertView.findViewById(R.id.tvListaTexto);
            item.tvTexto = (TextView)
                    convertView.findViewById(R.id.tvListaTitulo);

            convertView.setTag(item);
        }else {
            item = (Suporte) convertView.getTag();
        }

        Produto produto = lista.get( position );
        item.tvCodigo.setText( String.valueOf( produto.getId() ) );
        item.tvTitulo.setText(  produto.getId()  );
        item.tvTexto.setText(  produto.getNome()  );


        return convertView;
    }

    private class Suporte{

        TextView tvCodigo, tvTitulo, tvTexto;

    }

}










