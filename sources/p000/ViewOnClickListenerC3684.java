package p000;

import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: ۦًؗۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3684 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f12298;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12299;

    public /* synthetic */ ViewOnClickListenerC3684(int i, Object obj) {
        this.f12299 = i;
        this.f12298 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f12299;
        Object obj = this.f12298;
        switch (i) {
            case 0:
                ((AbstractC3305) obj).mo6070();
                break;
            case 1:
                C4865 c4865 = (C4865) obj;
                c4865.f16021.obtainMessage(1, c4865.f16009).sendToTarget();
                break;
            default:
                C4796 c4796 = ((Toolbar) obj).f139;
                C1092 c1092 = c4796 == null ? null : c4796.f15817;
                if (c1092 != null) {
                    c1092.collapseActionView();
                }
                break;
        }
    }
}
