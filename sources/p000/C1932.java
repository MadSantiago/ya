package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: ۥٞؒۙۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1932 extends AbstractC4958 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f6388;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1932(int i, Class cls, int i2, int i3, int i4) {
        super(i, cls, i2, i3);
        this.f6388 = i4;
    }

    @Override // p000.AbstractC4958
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo3792(View view, Object obj) {
        switch (this.f6388) {
            case 0:
                AbstractC3629.m6460(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC3629.m6459(view, (CharSequence) obj);
                break;
            default:
                AbstractC3629.m6463(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000.AbstractC4958
    /* JADX INFO: renamed from: ۥّ */
    public final boolean mo3793(Object obj, Object obj2) {
        switch (this.f6388) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }

    @Override // p000.AbstractC4958
    /* JADX INFO: renamed from: ۥۗ */
    public final Object mo3794(View view) {
        switch (this.f6388) {
            case 0:
                return Boolean.valueOf(AbstractC3629.m6458(view));
            case 1:
                return AbstractC3629.m6462(view);
            default:
                return Boolean.valueOf(AbstractC3629.m6461(view));
        }
    }
}
