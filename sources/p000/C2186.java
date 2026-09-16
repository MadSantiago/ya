package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥۘؗ۟ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2186 implements InterfaceC4559 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f7246;

    /* JADX INFO: renamed from: ۥُ */
    public Object f7247;

    /* JADX INFO: renamed from: ۥّ */
    public Object f7248;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f7249;

    /* JADX INFO: renamed from: ۥۣ */
    public int f7250;

    /* JADX INFO: renamed from: ۦؑ */
    public Object f7251;

    public C2186() {
        this.f7249 = new C0341[32];
        this.f7246 = new float[32];
        this.f7251 = new byte[32];
        C3639 c3639 = AbstractC5705.f18789;
        this.f7247 = new C3639();
        this.f7248 = new C3639();
    }

    @Override // p000.InterfaceC4559
    public void cancel() {
        Socket socket = ((C3641) this.f7246).f12177;
        if (socket != null) {
            AbstractC4031.m7222(socket);
        }
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥؗ */
    public void mo4239() {
        ((InterfaceC2674) this.f7247).flush();
    }

    /* JADX INFO: renamed from: ۥَ */
    public void m4240(PorterDuff.Mode mode) {
        C1138 c1138 = (C1138) this.f7247;
        if (c1138 == null) {
            c1138 = new C1138();
            this.f7247 = c1138;
        }
        c1138.f3982 = mode;
        c1138.f3981 = true;
        m4253();
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥُ */
    public long mo4241(C2147 c2147) {
        if (!AbstractC0452.m974(c2147)) {
            return 0L;
        }
        String strM8048 = c2147.f7034.m8048("Transfer-Encoding");
        if (strM8048 == null) {
            strM8048 = null;
        }
        if ("chunked".equalsIgnoreCase(strM8048)) {
            return -1L;
        }
        return AbstractC4031.m7226(c2147);
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥّ */
    public InterfaceC3832 mo4242(C2813 c2813, long j) {
        if ("chunked".equalsIgnoreCase(((C4714) c2813.f9390).m8048("Transfer-Encoding"))) {
            if (this.f7250 == 1) {
                this.f7250 = 2;
                return new C2558(this);
            }
            C0178.m386(this.f7250, "state: ");
            return null;
        }
        if (j == -1) {
            C1078.m2276("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.f7250 == 1) {
            this.f7250 = 2;
            return new C5197(this);
        }
        C0178.m386(this.f7250, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public void m4243(ColorStateList colorStateList) {
        if (colorStateList != null) {
            C1138 c1138 = (C1138) this.f7251;
            if (c1138 == null) {
                c1138 = new C1138();
                this.f7251 = c1138;
            }
            c1138.f3979 = colorStateList;
            c1138.f3980 = true;
        } else {
            this.f7251 = null;
        }
        m4253();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public void m4244(ColorStateList colorStateList) {
        C1138 c1138 = (C1138) this.f7247;
        if (c1138 == null) {
            c1138 = new C1138();
            this.f7247 = c1138;
        }
        c1138.f3979 = colorStateList;
        c1138.f3980 = true;
        m4253();
    }

    /* JADX INFO: renamed from: ۥٖ */
    public void m4245(C4714 c4714, String str) {
        InterfaceC2674 interfaceC2674 = (InterfaceC2674) this.f7247;
        if (this.f7250 != 0) {
            C0178.m386(this.f7250, "state: ");
            return;
        }
        interfaceC2674.mo2660(str).mo2660("\r\n");
        int size = c4714.size();
        for (int i = 0; i < size; i++) {
            interfaceC2674.mo2660(c4714.m8049(i)).mo2660(": ").mo2660(c4714.m8047(i)).mo2660("\r\n");
        }
        interfaceC2674.mo2660("\r\n");
        this.f7250 = 1;
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥۗ */
    public InterfaceC4598 mo4246(C2147 c2147) {
        if (!AbstractC0452.m974(c2147)) {
            return m4256(0L);
        }
        String strM8048 = c2147.f7034.m8048("Transfer-Encoding");
        if (strM8048 == null) {
            strM8048 = null;
        }
        if ("chunked".equalsIgnoreCase(strM8048)) {
            C0774 c0774 = (C0774) c2147.f7042.f9393;
            if (this.f7250 == 4) {
                this.f7250 = 5;
                return new C3450(this, c0774);
            }
            C0178.m386(this.f7250, "state: ");
            return null;
        }
        long jM7226 = AbstractC4031.m7226(c2147);
        if (jM7226 != -1) {
            return m4256(jM7226);
        }
        if (this.f7250 != 4) {
            C0178.m386(this.f7250, "state: ");
            return null;
        }
        this.f7250 = 5;
        ((C3641) this.f7246).m6511();
        return new C4147(this);
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥۜ */
    public C3641 mo4247() {
        return (C3641) this.f7246;
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۥۣ */
    public void mo4248(C2813 c2813) {
        Proxy.Type type = ((C3641) this.f7246).f12181.f13867.type();
        StringBuilder sb = new StringBuilder();
        sb.append((String) c2813.f9389);
        sb.append(' ');
        C0774 c0774 = (C0774) c2813.f9393;
        if (c0774.f2802 || type != Proxy.Type.HTTP) {
            String strM1666 = c0774.m1666();
            String strM1668 = c0774.m1668();
            if (strM1668 != null) {
                strM1666 = strM1666 + '?' + strM1668;
            }
            sb.append(strM1666);
        } else {
            sb.append(c0774);
        }
        sb.append(" HTTP/1.1");
        m4245((C4714) c2813.f9390, sb.toString());
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۦؑ */
    public void mo4249() {
        ((InterfaceC2674) this.f7247).flush();
    }

    /* JADX INFO: renamed from: ۦؚ */
    public boolean m4250() {
        return this.f7250 < ((List) this.f7251).size() || !((ArrayList) this.f7248).isEmpty();
    }

    /* JADX INFO: renamed from: ۦٌ */
    public void m4251(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM312;
        View view = (View) this.f7249;
        Context context = view.getContext();
        int[] iArr = AbstractC5618.f18516;
        C5460 c5460M9119 = C5460.m9119(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c5460M9119.f17999;
        View view2 = (View) this.f7249;
        AbstractC3608.m6435(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c5460M9119.f17999, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f7250 = typedArray.getResourceId(0, -1);
                C3465 c3465 = (C3465) this.f7246;
                Context context2 = view.getContext();
                int i2 = this.f7250;
                synchronized (c3465) {
                    colorStateListM312 = c3465.f11498.m312(context2, i2);
                }
                if (colorStateListM312 != null) {
                    m4243(colorStateListM312);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(c5460M9119.m9120(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(AbstractC3522.m6315(typedArray.getInt(2, -1), null));
            }
            c5460M9119.m9126();
        } catch (Throwable th) {
            c5460M9119.m9126();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public ColorStateList m4252() {
        C1138 c1138 = (C1138) this.f7247;
        if (c1138 != null) {
            return (ColorStateList) c1138.f3979;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public void m4253() {
        View view = (View) this.f7249;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C1138) this.f7251) != null) {
                C1138 c1138 = (C1138) this.f7248;
                if (c1138 == null) {
                    c1138 = new C1138();
                    this.f7248 = c1138;
                }
                c1138.f3979 = null;
                c1138.f3980 = false;
                c1138.f3982 = null;
                c1138.f3981 = false;
                WeakHashMap weakHashMap = AbstractC3608.f12013;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    c1138.f3980 = true;
                    c1138.f3979 = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    c1138.f3981 = true;
                    c1138.f3982 = backgroundTintMode;
                }
                if (c1138.f3980 || c1138.f3981) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = C3465.f11497;
                    C0141.m306(background, c1138, drawableState);
                    return;
                }
            }
            C1138 c1139 = (C1138) this.f7247;
            if (c1139 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = C3465.f11497;
                C0141.m306(background, c1139, drawableState2);
            } else {
                C1138 c11310 = (C1138) this.f7251;
                if (c11310 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = C3465.f11497;
                    C0141.m306(background, c11310, drawableState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public PorterDuff.Mode m4254() {
        C1138 c1138 = (C1138) this.f7247;
        if (c1138 != null) {
            return (PorterDuff.Mode) c1138.f3982;
        }
        return null;
    }

    @Override // p000.InterfaceC4559
    /* JADX INFO: renamed from: ۦۙ */
    public C1033 mo4255(boolean z) throws IOException {
        C3250 c3250 = (C3250) this.f7248;
        int i = this.f7250;
        if (i != 1 && i != 2 && i != 3) {
            C0178.m386(this.f7250, "state: ");
            return null;
        }
        try {
            String strMo2663 = ((InterfaceC4473) c3250.f10915).mo2663(c3250.f10916);
            c3250.f10916 -= (long) strMo2663.length();
            C3510 c3510M4130 = AbstractC2133.m4130(strMo2663);
            int i2 = c3510M4130.f11622;
            C1033 c1033 = new C1033();
            c1033.f3643 = (EnumC1658) c3510M4130.f11621;
            c1033.f3640 = i2;
            c1033.f3646 = (String) c3510M4130.f11624;
            c1033.f3642 = c3250.m5967().m8046();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.f7250 = 3;
                return c1033;
            }
            if (102 > i2 || i2 >= 200) {
                this.f7250 = 4;
                return c1033;
            }
            this.f7250 = 3;
            return c1033;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((C3641) this.f7246).f12181.f13868.f11486.m1665()), e);
        }
    }

    /* JADX INFO: renamed from: ۦۚ */
    public C3911 m4256(long j) {
        if (this.f7250 == 4) {
            this.f7250 = 5;
            return new C3911(this, j);
        }
        C0178.m386(this.f7250, "state: ");
        return null;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public void m4257(int i) {
        ColorStateList colorStateListM312;
        this.f7250 = i;
        C3465 c3465 = (C3465) this.f7246;
        if (c3465 != null) {
            Context context = ((View) this.f7249).getContext();
            synchronized (c3465) {
                colorStateListM312 = c3465.f11498.m312(context, i);
            }
        } else {
            colorStateListM312 = null;
        }
        m4243(colorStateListM312);
        m4253();
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m4258() {
        this.f7250 = -1;
        m4243(null);
        m4253();
    }

    public C2186(C2561 c2561, C3641 c3641, C4162 c4162, C5025 c5025) {
        this.f7249 = c2561;
        this.f7246 = c3641;
        this.f7251 = c4162;
        this.f7247 = c5025;
        C3250 c3250 = new C3250();
        c3250.f10915 = c4162;
        c3250.f10916 = 262144L;
        this.f7248 = c3250;
    }

    public C2186(View view) {
        this.f7250 = -1;
        this.f7249 = view;
        this.f7246 = C3465.m6241();
    }
}
