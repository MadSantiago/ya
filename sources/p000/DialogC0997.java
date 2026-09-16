package p000;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥََؓۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0997 extends DialogC2438 {

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC4448 f3567;

    /* JADX INFO: renamed from: ۥٖ */
    public C5348 f3568;

    /* JADX INFO: renamed from: ۥۖ */
    public final C4842 f3569;

    /* JADX INFO: renamed from: ۦٗ */
    public long f3570;

    /* JADX INFO: renamed from: ۦۛ */
    public final View f3571;

    public DialogC0997(InterfaceC4448 interfaceC4448, C5348 c5348, long j, View view, EnumC2459 enumC2459, InterfaceC2880 interfaceC2880, UUID uuid, C5825 c5825, InterfaceC4643 interfaceC4643) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f3567 = interfaceC4448;
        this.f3568 = c5348;
        this.f3570 = j;
        this.f3571 = view;
        Window window = getWindow();
        if (window == null) {
            C1078.m2276("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC5378.m9058(window, false);
        C4842 c4842 = new C4842(getContext());
        c4842.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c4842.setClipChildren(false);
        c4842.setElevation(interfaceC2880.mo741(8.0f));
        c4842.setOutlineProvider(new C1693(1));
        this.f3569 = c4842;
        setContentView(c4842);
        c4842.setTag(R.id.view_tree_lifecycle_owner, AbstractC5568.m9365(view));
        c4842.setTag(R.id.view_tree_view_model_store_owner, AbstractC3801.m6743(view));
        c4842.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC4593.m7995(view));
        m2178(this.f3567, this.f3568, this.f3570, enumC2459);
        window.getDecorView();
        int i = Build.VERSION.SDK_INT;
        AbstractC0186 c1554 = i >= 35 ? new C1554(window) : i >= 30 ? new C4764(window) : new C3326(window);
        this.f3568.getClass();
        c1554.mo448(AbstractC3925.m7036(this.f3570));
        this.f3568.getClass();
        c1554.mo447(AbstractC3925.m7036(this.f3570));
        C4023 c4023M4549 = m4549();
        this.f3568.getClass();
        c4023M4549.m7197(this, new C5013(interfaceC4643, c5825, new C0101(22, this)));
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f3567.mo449();
        }
        return zOnTouchEvent;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2178(InterfaceC4448 interfaceC4448, C5348 c5348, long j, EnumC2459 enumC2459) {
        this.f3567 = interfaceC4448;
        this.f3568 = c5348;
        this.f3570 = j;
        c5348.getClass();
        ViewGroup.LayoutParams layoutParams = this.f3571.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iM6632 = AbstractC3761.m6632(1);
        if (iM6632 != 0) {
            if (iM6632 == 1) {
                z = true;
            } else {
                if (iM6632 != 2) {
                    C1078.m2275();
                    return;
                }
                z = false;
            }
        }
        getWindow().setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal = enumC2459.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            C1078.m2275();
            return;
        }
        this.f3569.setLayoutDirection(i);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
