package p000;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: renamed from: ۥًٗؑٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC1501 implements View.OnDragListener, InterfaceC3162 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C4066 f5104;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1821 f5105;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3920 f5106;

    public ViewOnDragListenerC1501() {
        C3920 c3920 = new C3920();
        c3920.f13067 = 0L;
        this.f5106 = c3920;
        this.f5105 = new C1821(0);
        this.f5104 = new C4066(this);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        C5086 c5086 = new C5086(21, dragEvent);
        int action = dragEvent.getAction();
        EnumC1848 enumC1848 = EnumC1848.f6133;
        C1821 c1821 = this.f5105;
        C3920 c3920 = this.f5106;
        switch (action) {
            case 1:
                C5662 c5662 = new C5662();
                C3428 c3428 = new C3428(c5086, c3920, c5662);
                if (c3428.mo211(c3920) == enumC1848) {
                    AbstractC5378.m9064(c3920, c3428);
                }
                boolean z = c5662.f18631;
                C1102 c1102 = new C1102(c1821);
                while (c1102.hasNext()) {
                    ((C3920) c1102.next()).m7022();
                }
                return z;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                c3920.m7018(c5086);
                return false;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return c3920.m7019();
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                C2932 c2932 = new C2932(15, c5086);
                if (c2932.mo211(c3920) == enumC1848) {
                    AbstractC5378.m9064(c3920, c2932);
                }
                c1821.clear();
                return false;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                c3920.m7021();
                return false;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                c3920.m7020();
                return false;
            default:
                return false;
        }
    }
}
