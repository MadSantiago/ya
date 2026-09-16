package p000;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: ۥؘٞؖۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1975 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C0859 f6533;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C4865 f6534;

    public C1975(C0859 c0859, C4865 c4865) {
        this.f6533 = c0859;
        this.f6534 = c4865;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0859 c0859 = this.f6533;
        DialogInterface.OnClickListener onClickListener = c0859.f3172;
        C4865 c4865 = this.f6534;
        onClickListener.onClick(c4865.f16009, i);
        if (c0859.f3176) {
            return;
        }
        c4865.f16009.dismiss();
    }
}
