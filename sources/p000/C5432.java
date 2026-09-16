package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: ۦ۠ٝۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5432 implements TextWatcher {

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f17923 = true;

    /* JADX INFO: renamed from: ۦۨ */
    public final EditText f17924;

    public C5432(EditText editText) {
        this.f17924 = editText;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f17924.isInEditMode();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
