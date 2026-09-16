package p000;

import android.view.ActionMode;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦْٜۗؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4954 implements InterfaceC1180 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ Object f16387;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f16388;

    public /* synthetic */ C4954(int i, Object obj) {
        this.f16388 = i;
        this.f16387 = obj;
    }

    @Override // p000.InterfaceC1180
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo497() throws C0768 {
        int i = this.f16388;
        Object obj = this.f16387;
        switch (i) {
            case 0:
                DialogC3219 dialogC3219 = (DialogC3219) obj;
                dialogC3219.dismiss();
                dialogC3219.f10808.m5668();
                break;
            case 1:
                C2453 c2453 = (C2453) obj;
                c2453.m5668();
                c2453.setTag(R.id.view_tree_lifecycle_owner, null);
                c2453.f8184.removeViewImmediate(c2453);
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C3738 c3738 = (C3738) obj;
                C5389 c5389 = c3738.f12445;
                C5322 c5322 = c5389.f17814;
                if (c5322 != null) {
                    c5322.m8926();
                }
                c5389.m9079();
                ActionMode actionMode = c3738.f12448;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c3738.f12448 = null;
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C0843 c0843 = (C0843) ((C4817) obj).f15877.getValue();
                if (c0843 != null) {
                    c0843.close();
                }
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C2600 c2600 = ((C4153) obj).f13838;
                if (c2600 != null) {
                    c2600.mo3713(null);
                }
                break;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C1493) obj).f5063.mo449();
                break;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C3635) obj).m6480();
                break;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C4133) obj).f13757 = null;
                break;
            case 8:
                C2750 c2750 = (C2750) obj;
                C1405 c1405 = c2750.f9097;
                if (c1405 != null) {
                    c1405.f4837 = false;
                }
                c2750.f9097 = null;
                break;
            case 9:
                ((C1506) obj).f5115 = true;
                break;
            default:
                DialogC0997 dialogC0997 = (DialogC0997) obj;
                dialogC0997.dismiss();
                dialogC0997.f3569.m5668();
                break;
        }
    }
}
