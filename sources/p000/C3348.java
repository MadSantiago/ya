package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: ۦٍؖؔؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3348 implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C0990 f11198;

    public C3348(C0990 c0990) {
        this.f11198 = c0990;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C1391 c1391;
        if (i == -1 || (c1391 = this.f11198.f3497) == null) {
            return;
        }
        c1391.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
