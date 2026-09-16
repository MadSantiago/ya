package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: ۦٕ */
    public final ArrayAdapter f214;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f214 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f216;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo78() {
        ArrayAdapter arrayAdapter = this.f214;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
