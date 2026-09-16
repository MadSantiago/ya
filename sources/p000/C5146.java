package p000;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: renamed from: ۦٍُۚؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5146 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۥۣ */
    public final TextView f17049;

    public C5146(TextView textView, InputConnection inputConnection) {
        super(inputConnection, false);
        this.f17049 = textView;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return AbstractC2133.m4158(this, this.f17049.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return AbstractC2133.m4158(this, this.f17049.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
