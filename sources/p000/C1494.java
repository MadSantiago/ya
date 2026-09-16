package p000;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: ۥٖۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1494 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f5065;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f5066;

    public /* synthetic */ C1494(int i, Object obj) {
        this.f5066 = i;
        this.f5065 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.f5066;
        Object obj = this.f5065;
        switch (i2) {
            case 0:
                C3337 c3337 = (C3337) obj;
                C3689 c3689 = c3337.f11165;
                c3689.setSelection(i);
                if (c3689.getOnItemClickListener() != null) {
                    c3689.performItemClick(view, i, c3337.f11166.getItemId(i));
                }
                c3337.dismiss();
                break;
            default:
                C5615 c5615 = (C5615) obj;
                C0990 c0990 = c5615.f18500;
                if (i < 0) {
                    item = !c0990.f3515.isShowing() ? null : c0990.f3497.getSelectedItem();
                } else {
                    item = c5615.getAdapter().getItem(i);
                }
                c5615.setText(c5615.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = c5615.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !c0990.f3515.isShowing() ? null : c0990.f3497.getSelectedView();
                        i = !c0990.f3515.isShowing() ? -1 : c0990.f3497.getSelectedItemPosition();
                        j = !c0990.f3515.isShowing() ? Long.MIN_VALUE : c0990.f3497.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c0990.f3497, view, i, j);
                }
                c0990.dismiss();
                break;
        }
    }
}
