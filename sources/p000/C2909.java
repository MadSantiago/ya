package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۨؒ۠ؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2909 implements InterfaceC3388 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int[][] f9698;

    /* JADX INFO: renamed from: ۥۗ */
    public final C4040 f9699;

    /* JADX INFO: renamed from: ۥۣ */
    public final int f9700;

    /* JADX INFO: renamed from: ۦؑ */
    public final C4040[] f9701;

    public C2909(C0376 c0376) {
        this.f9700 = c0376.f1401;
        this.f9699 = (C4040) c0376.f1400;
        this.f9698 = (int[][]) c0376.f1399;
        this.f9701 = (C4040[]) c0376.f1402;
    }

    /* JADX INFO: renamed from: ۥُ */
    public static void m5481(C0376 c0376, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC0980.f3458;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                C0074 c0074 = new C0074(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                C4040 c4040M9723 = C4040.m7237(contextThemeWrapper.obtainStyledAttributes(AbstractC0980.f3464), c0074).m9723();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i);
                int i4 = c0376.f1401;
                if (i4 == 0 || iArrTrimStateSet.length == 0) {
                    c0376.f1400 = c4040M9723;
                }
                int[][] iArr3 = (int[][]) c0376.f1399;
                if (i4 >= iArr3.length) {
                    int i5 = i4 + 10;
                    int[][] iArr4 = new int[i5][];
                    System.arraycopy(iArr3, 0, iArr4, 0, i4);
                    c0376.f1399 = iArr4;
                    C4040[] c4040Arr = new C4040[i5];
                    System.arraycopy((C4040[]) c0376.f1402, 0, c4040Arr, 0, i4);
                    c0376.f1402 = c4040Arr;
                }
                int[][] iArr5 = (int[][]) c0376.f1399;
                int i6 = c0376.f1401;
                iArr5[i6] = iArrTrimStateSet;
                ((C4040[]) c0376.f1402)[i6] = c4040M9723;
                c0376.f1401 = i6 + 1;
            }
        }
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۥؗ */
    public final C4040 mo5482() {
        return this.f9699;
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۥۗ */
    public final C4040 mo5483(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        while (true) {
            i = -1;
            i2 = this.f9700;
            iArr2 = this.f9698;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            for (int i4 = 0; i4 < i2; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                    i = i4;
                    break;
                }
            }
            i3 = i;
        }
        return this.f9701[i3];
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۥۣ */
    public final C4040 mo5484(float f) {
        return this.f9699.mo5484(f);
    }

    @Override // p000.InterfaceC3388
    /* JADX INFO: renamed from: ۦؑ */
    public final boolean mo5485() {
        return this.f9700 > 1;
    }
}
