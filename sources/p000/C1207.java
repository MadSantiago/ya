package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥْؓ۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1207 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f4158;

    /* JADX INFO: renamed from: ۥَ */
    public int f4159;

    /* JADX INFO: renamed from: ۥُ */
    public boolean f4160;

    /* JADX INFO: renamed from: ۥّ */
    public int f4161;

    /* JADX INFO: renamed from: ۥْ */
    public int f4162;

    /* JADX INFO: renamed from: ۥٓ */
    public float f4163;

    /* JADX INFO: renamed from: ۥٖ */
    public InterfaceC3388 f4164;

    /* JADX INFO: renamed from: ۥۖ */
    public final Rect f4165;

    /* JADX INFO: renamed from: ۥۗ */
    public int f4166;

    /* JADX INFO: renamed from: ۥۜ */
    public int f4167;

    /* JADX INFO: renamed from: ۥۣ */
    public Drawable.ConstantState f4168;

    /* JADX INFO: renamed from: ۦؑ */
    public int f4169;

    /* JADX INFO: renamed from: ۦؚ */
    public float f4170;

    /* JADX INFO: renamed from: ۦٌ */
    public int f4171;

    /* JADX INFO: renamed from: ۦِ */
    public float f4172;

    /* JADX INFO: renamed from: ۦٕ */
    public int[] f4173;

    /* JADX INFO: renamed from: ۦٗ */
    public int f4174;

    /* JADX INFO: renamed from: ۦٛ */
    public int f4175;

    /* JADX INFO: renamed from: ۦۗ */
    public int f4176;

    /* JADX INFO: renamed from: ۦۙ */
    public int f4177;

    /* JADX INFO: renamed from: ۦۚ */
    public float f4178;

    /* JADX INFO: renamed from: ۦۛ */
    public int f4179;

    /* JADX INFO: renamed from: ۦ۟ */
    public float f4180;

    /* JADX INFO: renamed from: ۦۨ */
    public int f4181;

    public C1207(C1207 c1207) {
        this.f4166 = 0;
        this.f4158 = false;
        this.f4169 = Integer.MIN_VALUE;
        this.f4160 = false;
        this.f4161 = Integer.MIN_VALUE;
        this.f4177 = Integer.MIN_VALUE;
        this.f4167 = Integer.MIN_VALUE;
        this.f4175 = Integer.MIN_VALUE;
        this.f4172 = Float.NaN;
        this.f4176 = Integer.MIN_VALUE;
        this.f4170 = Float.NaN;
        this.f4171 = Integer.MIN_VALUE;
        this.f4178 = Float.NaN;
        this.f4181 = Integer.MIN_VALUE;
        this.f4180 = Float.NaN;
        this.f4162 = Integer.MIN_VALUE;
        this.f4163 = Float.NaN;
        this.f4159 = Integer.MIN_VALUE;
        this.f4164 = null;
        this.f4174 = Integer.MIN_VALUE;
        this.f4179 = Integer.MIN_VALUE;
        this.f4165 = null;
        this.f4173 = FocusRingDrawable.f323;
        if (c1207 != null) {
            this.f4168 = c1207.f4168;
            this.f4166 = c1207.f4166;
            this.f4158 = c1207.f4158;
            this.f4169 = c1207.f4169;
            this.f4160 = c1207.f4160;
            this.f4161 = c1207.f4161;
            this.f4177 = c1207.f4177;
            this.f4167 = c1207.f4167;
            this.f4175 = c1207.f4175;
            this.f4172 = c1207.f4172;
            this.f4176 = c1207.f4176;
            this.f4170 = c1207.f4170;
            this.f4171 = c1207.f4171;
            this.f4178 = c1207.f4178;
            this.f4181 = c1207.f4181;
            this.f4180 = c1207.f4180;
            this.f4162 = c1207.f4162;
            this.f4163 = c1207.f4163;
            this.f4159 = c1207.f4159;
            this.f4174 = c1207.f4174;
            this.f4179 = c1207.f4179;
            InterfaceC3388 interfaceC3388 = c1207.f4164;
            if (interfaceC3388 instanceof C4040) {
                this.f4164 = ((C4040) interfaceC3388).m7240().m9723();
            } else if (interfaceC3388 instanceof C2909) {
                C2909 c2909 = (C2909) interfaceC3388;
                C0376 c0376 = new C0376();
                int i = c2909.f9700;
                c0376.f1401 = i;
                c0376.f1400 = c2909.f9699;
                int[][] iArr = c2909.f9698;
                int[][] iArr2 = new int[iArr.length][];
                c0376.f1399 = iArr2;
                C4040[] c4040Arr = c2909.f9701;
                c0376.f1402 = new C4040[c4040Arr.length];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(c4040Arr, 0, (C4040[]) c0376.f1402, 0, c0376.f1401);
                this.f4164 = c0376.f1401 != 0 ? new C2909(c0376) : null;
            } else {
                this.f4164 = interfaceC3388;
            }
            if (c1207.f4165 != null) {
                this.f4165 = new Rect(c1207.f4165);
            }
            int[] iArr3 = c1207.f4173;
            this.f4173 = Arrays.copyOf(iArr3, iArr3.length);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f4168;
        return this.f4166 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, (Resources) null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources);
    }
}
