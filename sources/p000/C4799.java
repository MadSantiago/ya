package p000;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦٞؕٗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4799 {

    /* JADX INFO: renamed from: ۥؗ */
    public Interpolator f15830;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f15831;

    /* JADX INFO: renamed from: ۦؑ */
    public InterfaceC1953 f15835;

    /* JADX INFO: renamed from: ۥۗ */
    public long f15833 = -1;

    /* JADX INFO: renamed from: ۥّ */
    public final C1809 f15832 = new C1809(this);

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f15834 = new ArrayList();

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8176() {
        View view;
        if (this.f15831) {
            return;
        }
        for (C1551 c1551 : this.f15834) {
            long j = this.f15833;
            if (j >= 0) {
                c1551.m3297(j);
            }
            Interpolator interpolator = this.f15830;
            if (interpolator != null && (view = (View) c1551.f5238.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f15835 != null) {
                c1551.m3301(this.f15832);
            }
            View view2 = (View) c1551.f5238.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f15831 = true;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8177() {
        if (this.f15831) {
            Iterator it = this.f15834.iterator();
            while (it.hasNext()) {
                ((C1551) it.next()).m3299();
            }
            this.f15831 = false;
        }
    }
}
