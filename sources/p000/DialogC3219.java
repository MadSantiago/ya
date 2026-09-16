package p000;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦؔؓٓٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC3219 extends DialogC2438 {

    /* JADX INFO: renamed from: ۥَ */
    public InterfaceC4448 f10804;

    /* JADX INFO: renamed from: ۥٖ */
    public C4231 f10805;

    /* JADX INFO: renamed from: ۥۖ */
    public boolean f10806;

    /* JADX INFO: renamed from: ۦٗ */
    public final View f10807;

    /* JADX INFO: renamed from: ۦۛ */
    public final C0617 f10808;

    public DialogC3219(InterfaceC4448 interfaceC4448, C4231 c4231, View view, EnumC2459 enumC2459, InterfaceC2880 interfaceC2880, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        this.f10804 = interfaceC4448;
        this.f10805 = c4231;
        this.f10807 = view;
        Window window = getWindow();
        if (window == null) {
            C1078.m2276("Dialog has no window");
            throw null;
        }
        C4231 c4232 = this.f10805;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            c4232.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f10805.getClass();
        AbstractC5378.m9058(window, true);
        window.setGravity(17);
        this.f10805.getClass();
        C0617 c0617 = new C0617(getContext(), window);
        this.f10805.getClass();
        setTitle("");
        c0617.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c0617.setClipChildren(false);
        c0617.setElevation(interfaceC2880.mo741(8.0f));
        c0617.setOutlineProvider(new C1693(0));
        this.f10808 = c0617;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m5909(viewGroup);
        }
        setContentView(c0617);
        c0617.setTag(R.id.view_tree_lifecycle_owner, AbstractC5568.m9365(view));
        c0617.setTag(R.id.view_tree_view_model_store_owner, AbstractC3801.m6743(view));
        c0617.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC4593.m7995(view));
        m5910(this.f10804, this.f10805, enumC2459);
        m4549().m7197(this, new C0316(new C3587(this, i)));
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static final void m5909(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C0617) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m5909(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f10805.getClass();
        if (!keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f10804.mo449();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iM5235;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        this.f10805.getClass();
        C0617 c0617 = this.f10808;
        c0617.getClass();
        if (Math.abs(motionEvent.getX()) > Float.MAX_VALUE || Math.abs(motionEvent.getY()) > Float.MAX_VALUE || (childAt = c0617.getChildAt(0)) == null) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                this.f10806 = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.f10806 = false;
                    return zOnTouchEvent;
                }
            } else if (this.f10806) {
                this.f10804.mo449();
                this.f10806 = false;
                return true;
            }
        } else {
            int left = childAt.getLeft() + c0617.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + c0617.getTop();
            int height = childAt.getHeight() + top;
            int iM5236 = AbstractC2776.m5235(motionEvent.getX());
            if (left > iM5236 || iM5236 > width || top > (iM5235 = AbstractC2776.m5235(motionEvent.getY())) || iM5235 > height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    this.f10806 = true;
                    return true;
                }
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.f10806 = false;
                        return zOnTouchEvent;
                    }
                } else if (this.f10806) {
                    this.f10804.mo449();
                    this.f10806 = false;
                    return true;
                }
            } else {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
                    this.f10806 = false;
                    return zOnTouchEvent;
                }
            }
        }
        return zOnTouchEvent;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m5910(InterfaceC4448 interfaceC4448, C4231 c4231, EnumC2459 enumC2459) {
        int i;
        this.f10804 = interfaceC4448;
        this.f10805 = c4231;
        c4231.getClass();
        boolean zM5616 = AbstractC3026.m5616(this.f10807);
        int iM6632 = AbstractC3761.m6632(1);
        if (iM6632 != 0) {
            if (iM6632 == 1) {
                zM5616 = true;
            } else {
                if (iM6632 != 2) {
                    C1078.m2275();
                    return;
                }
                zM5616 = false;
            }
        }
        getWindow().setFlags(zM5616 ? 8192 : -8193, 8192);
        int iOrdinal = enumC2459.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                C1078.m2275();
                return;
            }
            i = 1;
        }
        C0617 c0617 = this.f10808;
        c0617.setLayoutDirection(i);
        Window window = c0617.f2307;
        boolean z = (c0617.f2306 && true == c0617.f2303 && true == c0617.f2302) ? false : true;
        c0617.f2303 = true;
        c0617.f2302 = true;
        if (z && (-2 != window.getAttributes().width || !c0617.f2306)) {
            window.setLayout(-2, -2);
            c0617.f2306 = true;
        }
        setCanceledOnTouchOutside(true);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
