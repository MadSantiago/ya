package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥۥؕۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2751 extends AbstractC2164 {

    /* JADX INFO: renamed from: ۥۜ */
    public final /* synthetic */ int f9103;

    /* JADX INFO: renamed from: ۦٛ */
    public final /* synthetic */ Object f9104;

    public /* synthetic */ C2751(int i, Object obj) {
        this.f9103 = i;
        this.f9104 = obj;
    }

    @Override // p000.AbstractC2164, p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥؗ */
    public void mo3065() {
        int i = this.f9103;
        Object obj = this.f9104;
        switch (i) {
            case 0:
                ((RunnableC4929) obj).f16241.f6169.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = (LayoutInflaterFactory2C1852) obj;
                layoutInflaterFactory2C1852.f6169.setVisibility(0);
                if (layoutInflaterFactory2C1852.f6169.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1852.f6169.getParent();
                    WeakHashMap weakHashMap = AbstractC3608.f12013;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // p000.InterfaceC1953
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo526() {
        int i = this.f9103;
        Object obj = this.f9104;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C1852 layoutInflaterFactory2C1852 = ((RunnableC4929) obj).f16241;
                layoutInflaterFactory2C1852.f6169.setAlpha(1.0f);
                layoutInflaterFactory2C1852.f6182.m3301(null);
                layoutInflaterFactory2C1852.f6182 = null;
                break;
            case 1:
                LayoutInflaterFactory2C1852 layoutInflaterFactory2C1853 = (LayoutInflaterFactory2C1852) obj;
                layoutInflaterFactory2C1853.f6169.setAlpha(1.0f);
                layoutInflaterFactory2C1853.f6182.m3301(null);
                layoutInflaterFactory2C1853.f6182 = null;
                break;
            default:
                LayoutInflaterFactory2C1852 layoutInflaterFactory2C1854 = (LayoutInflaterFactory2C1852) ((C5002) obj).f16550;
                layoutInflaterFactory2C1854.f6169.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C1854.f6177;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1854.f6169.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C1854.f6169.getParent();
                    WeakHashMap weakHashMap = AbstractC3608.f12013;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C1854.f6169.m12();
                layoutInflaterFactory2C1854.f6182.m3301(null);
                layoutInflaterFactory2C1854.f6182 = null;
                ViewGroup viewGroup = layoutInflaterFactory2C1854.f6187;
                WeakHashMap weakHashMap2 = AbstractC3608.f12013;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
