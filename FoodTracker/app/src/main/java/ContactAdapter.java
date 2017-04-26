//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//
//import example.codeclan.com.foodtracker.R;
//
///**
// * Created by user on 26/04/2017.
// */
//
//public class ContactAdapter extends BaseAdapter {
//    @Override
//    public int getCount() {
//        return 0;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
////    public View getView(int position, View convertView, ViewGroup parent) {
////        return null;
////    }
//
//    @Override
//    public int getViewTypeCount() {
//        return 2;
//    }
//
//    @Override
////    public int getItemViewType(int position) {
////        return (contactList.get(position).getContactType() == ContactType.CONTACT_WITH_IMAGE) ? 0 : 1;
////    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View v = convertView;
//        int type = getItemViewType(position);
//        if (v == null) {
//            // Inflate the layout according to the view type
//            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            if (type == 0) {
//                // Inflate the layout with image
//                v = inflater.inflate(R.layout.image_contact_layout, parent, false);
//            }
//            else {
//                v = inflater.inflate(R.layout.simple_contact_layout, parent, false);
//            }
//        }
//        //
//        Contact c = contactList.get(position);
//
//        TextView surname = (TextView) v.findViewById(R.id.surname);
//        TextView name = (TextView) v.findViewById(R.id.name);
//        TextView email = (TextView) v.findViewById(R.id.email);
//
//        if (type == 0) {
//            ImageView img = (ImageView) v.findViewById(R.id.img);
//            img.setImageResource(c.imageId);
//        }
//
//        surname.setText(c.surname);
//        name.setText(c.name);
//        email.setText(c.email);
//
//        return v;
//    }
//}
