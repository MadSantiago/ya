package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ۥٕٜؓؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0324 extends C2465 implements Checkable, InterfaceC3863 {

    /* JADX INFO: renamed from: ۥؙ */
    public static final int[] f1184 = {R.attr.state_checkable};

    /* JADX INFO: renamed from: ۥۡ */
    public static final int[] f1185 = {R.attr.state_checked};

    /* JADX INFO: renamed from: ۥؓ */
    public String f1186;

    /* JADX INFO: renamed from: ۥؔ */
    public float f1187;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f1188;

    /* JADX INFO: renamed from: ۥؚ */
    public float f1189;

    /* JADX INFO: renamed from: ۥً */
    public int f1190;

    /* JADX INFO: renamed from: ۥَ */
    public final LinkedHashSet f1191;

    /* JADX INFO: renamed from: ۥٓ */
    public final C1096 f1192;

    /* JADX INFO: renamed from: ۥٕ */
    public int f1193;

    /* JADX INFO: renamed from: ۥٖ */
    public PorterDuff.Mode f1194;

    /* JADX INFO: renamed from: ۥ٘ */
    public boolean f1195;

    /* JADX INFO: renamed from: ۥٙ */
    public Drawable f1196;

    /* JADX INFO: renamed from: ۥٛ */
    public int f1197;

    /* JADX INFO: renamed from: ۥٝ */
    public EnumC5059 f1198;

    /* JADX INFO: renamed from: ۥۖ */
    public PorterDuff.Mode f1199;

    /* JADX INFO: renamed from: ۥۙ */
    public int f1200;

    /* JADX INFO: renamed from: ۥ۟ */
    public float f1201;

    /* JADX INFO: renamed from: ۥۤ */
    public int f1202;

    /* JADX INFO: renamed from: ۥۦ */
    public boolean f1203;

    /* JADX INFO: renamed from: ۥۧ */
    public int f1204;

    /* JADX INFO: renamed from: ۦؒ */
    public int f1205;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f1206;

    /* JADX INFO: renamed from: ۦؗ */
    public int f1207;

    /* JADX INFO: renamed from: ۦؙ */
    public int f1208;

    /* JADX INFO: renamed from: ۦُ */
    public int f1209;

    /* JADX INFO: renamed from: ۦٕ */
    public ColorStateList f1210;

    /* JADX INFO: renamed from: ۦٖ */
    public int f1211;

    /* JADX INFO: renamed from: ۦٗ */
    public ColorStateList f1212;

    /* JADX INFO: renamed from: ۦٚ */
    public int f1213;

    /* JADX INFO: renamed from: ۦۛ */
    public Drawable f1214;

    /* JADX INFO: renamed from: ۦۜ */
    public int f1215;

    /* JADX INFO: renamed from: ۦۣ */
    public int f1216;

    /* JADX WARN: Code duplicated, block: B:28:0x00f9  */
    public C0324(Context context, AttributeSet attributeSet) {
        InterfaceC3388 c2909;
        int next;
        int resourceId;
        int resourceId2;
        Drawable drawableM7464;
        super(AbstractC2765.m5150(context, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.materialButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_Button, new int[]{ru.bluecat.yandexmapspatcher.R.attr.materialSizeOverlay}), attributeSet, ru.bluecat.yandexmapspatcher.R.attr.materialButtonStyle);
        this.f1191 = new LinkedHashSet();
        this.f1206 = false;
        this.f1203 = false;
        this.f1211 = Integer.MIN_VALUE;
        this.f1187 = -2.1474836E9f;
        this.f1215 = Integer.MIN_VALUE;
        this.f1216 = Integer.MIN_VALUE;
        this.f1202 = Integer.MIN_VALUE;
        this.f1198 = EnumC5059.f16793;
        Context context2 = getContext();
        C5063.m8618(context2, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.materialButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_Button);
        int[] iArr = AbstractC0980.f3461;
        C5063.m8620(context2, attributeSet, iArr, ru.bluecat.yandexmapspatcher.R.attr.materialButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_Button, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, ru.bluecat.yandexmapspatcher.R.attr.materialButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_Button);
        this.f1193 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, 0);
        int i = typedArrayObtainStyledAttributes.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1194 = AbstractC2774.m5172(i);
        this.f1212 = AbstractC4225.m7448(getContext(), typedArrayObtainStyledAttributes, 15);
        this.f1214 = (!typedArrayObtainStyledAttributes.hasValue(11) || (resourceId2 = typedArrayObtainStyledAttributes.getResourceId(11, 0)) == 0 || (drawableM7464 = AbstractC4225.m7464(getContext(), resourceId2)) == null) ? typedArrayObtainStyledAttributes.getDrawable(11) : drawableM7464;
        this.f1207 = typedArrayObtainStyledAttributes.getInteger(12, 1);
        this.f1204 = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.f1199 = AbstractC2774.m5172(typedArrayObtainStyledAttributes.getInt(22, -1));
        this.f1210 = typedArrayObtainStyledAttributes.hasValue(21) ? AbstractC4225.m7448(getContext(), typedArrayObtainStyledAttributes, 21) : this.f1212;
        this.f1209 = typedArrayObtainStyledAttributes.getInteger(20, 3);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(19) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(19, 0)) == 0 || (drawable = AbstractC4225.m7464(getContext(), resourceId)) == null) ? typedArrayObtainStyledAttributes.getDrawable(19) : drawable;
        this.f1196 = drawable;
        this.f1188 = drawable == null;
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        if (resourceId3 != 0 && Objects.equals(context2.getResources().getResourceTypeName(resourceId3), "xml")) {
            C0376 c0376 = new C0376();
            c0376.m812();
            try {
                XmlResourceParser xml = context2.getResources().getXml(resourceId3);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (xml.getName().equals("selector")) {
                        C2909.m5481(c0376, context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    if (c0376.f1401 == 0) {
                        c2909 = null;
                    } else {
                        c2909 = new C2909(c0376);
                    }
                } catch (Throwable th) {
                    if (xml == null) {
                        throw th;
                    }
                    try {
                        xml.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                c0376.m812();
            }
        } else {
            c2909 = null;
        }
        c2909 = c2909 == null ? C4040.m7236(context2, attributeSet, ru.bluecat.yandexmapspatcher.R.attr.materialButtonStyle, ru.bluecat.yandexmapspatcher.R.style.Widget_MaterialComponents_Button).m9723() : c2909;
        boolean z = typedArrayObtainStyledAttributes.getBoolean(17, false);
        C1096 c1096 = new C1096(this, c2909);
        this.f1192 = c1096;
        c1096.f3846 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        c1096.f3847 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
        c1096.f3861 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
        c1096.f3852 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
        if (typedArrayObtainStyledAttributes.hasValue(9)) {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1);
            c1096.f3859 = dimensionPixelSize;
            c1096.f3851 = c1096.f3851.mo5484(dimensionPixelSize);
            c1096.m2322();
            c1096.f3849 = true;
        }
        c1096.f3857 = typedArrayObtainStyledAttributes.getDimensionPixelSize(26, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(8, -1);
        PorterDuff.Mode mode2 = PorterDuff.Mode.SRC_IN;
        c1096.f3860 = AbstractC2774.m5172(i2);
        c1096.f3855 = AbstractC4225.m7448(getContext(), typedArrayObtainStyledAttributes, 7);
        c1096.f3856 = AbstractC4225.m7448(getContext(), typedArrayObtainStyledAttributes, 25);
        c1096.f3862 = AbstractC4225.m7448(getContext(), typedArrayObtainStyledAttributes, 18);
        c1096.f3845 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        c1096.f3863 = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        c1096.f3850 = typedArrayObtainStyledAttributes.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            c1096.f3848 = true;
            setSupportBackgroundTintList(c1096.f3855);
            setSupportBackgroundTintMode(c1096.f3860);
        } else {
            c1096.m2318();
        }
        setPaddingRelative(paddingStart + c1096.f3846, paddingTop + c1096.f3861, paddingEnd + c1096.f3847, paddingBottom + c1096.f3852);
        setCheckedInternal(typedArrayObtainStyledAttributes.getBoolean(1, false));
        if (c2909 instanceof C2909) {
            c1096.f3844 = m708();
            if (c1096.f3851 instanceof C2909) {
                c1096.m2322();
            }
        }
        setOpticalCenterEnabled(z);
        typedArrayObtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.f1193);
        m726(this.f1214 != null);
        m709(this.f1196 != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private float getDisplayedWidthIncrease() {
        return this.f1201;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        C1096 c1096 = this.f1192;
        if (c1096 == null || !c1096.f3845 || this.f1206 == z) {
            return;
        }
        this.f1206 = z;
        refreshDrawableState();
        getParent();
        if (this.f1203) {
            return;
        }
        this.f1203 = true;
        Iterator it = this.f1191.iterator();
        if (it.hasNext()) {
            throw AbstractC5078.m8675(it);
        }
        this.f1203 = false;
    }

    private void setDisplayedWidthIncrease(float f) {
        if (this.f1201 != f) {
            this.f1201 = f;
            m713();
            invalidate();
            getParent();
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f1186)) {
            return this.f1186;
        }
        C1096 c1096 = this.f1192;
        return ((c1096 == null || !c1096.f3845) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.f1202;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m725()) {
            return this.f1192.f3859;
        }
        return 0;
    }

    public C3312 getCornerSpringForce() {
        return this.f1192.f3844;
    }

    public Drawable getIcon() {
        return this.f1214;
    }

    public int getIconGravity() {
        return this.f1207;
    }

    public int getIconPadding() {
        return this.f1193;
    }

    public int getIconSize() {
        return this.f1204;
    }

    public ColorStateList getIconTint() {
        return this.f1212;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1194;
    }

    public int getInsetBottom() {
        return this.f1192.f3852;
    }

    public int getInsetLeft() {
        return this.f1192.f3846;
    }

    public int getInsetRight() {
        return this.f1192.f3847;
    }

    public int getInsetTop() {
        return this.f1192.f3861;
    }

    public ColorStateList getRippleColor() {
        if (m725()) {
            return this.f1192.f3862;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.f1196;
    }

    public int getSecondaryIconGravity() {
        return this.f1209;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.f1210;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.f1199;
    }

    public InterfaceC3388 getShapeAppearance() {
        if (m725()) {
            return this.f1192.f3851;
        }
        C1078.m2276("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public C4040 getShapeAppearanceModel() {
        if (m725()) {
            return this.f1192.f3851.mo5482();
        }
        C1078.m2276("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m725()) {
            return this.f1192.f3856;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m725()) {
            return this.f1192.f3857;
        }
        return 0;
    }

    @Override // p000.C2465
    public ColorStateList getSupportBackgroundTintList() {
        return m725() ? this.f1192.f3855 : super.getSupportBackgroundTintList();
    }

    @Override // p000.C2465
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m725() ? this.f1192.f3860 : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1206;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m725()) {
            C3472 c3472M2321 = this.f1192.m2321(false);
            C1104 c1104 = c3472M2321.f11547.f14831;
            if (c1104 == null || !c1104.f3883) {
                return;
            }
            float elevation = 0.0f;
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                elevation += ((View) parent).getElevation();
            }
            C4488 c4488 = c3472M2321.f11547;
            if (c4488.f14835 != elevation) {
                c4488.f14835 = elevation;
                c3472M2321.m6276();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        C1096 c1096 = this.f1192;
        if (c1096 != null && c1096.f3845) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1184);
        }
        if (this.f1206) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1185);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p000.C2465, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1206);
    }

    @Override // p000.C2465, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C1096 c1096 = this.f1192;
        accessibilityNodeInfo.setCheckable(c1096 != null && c1096.f3845);
        accessibilityNodeInfo.setChecked(this.f1206);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p000.C2465, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        m712(getMeasuredWidth(), getMeasuredHeight());
        m714(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.f1211 != i6) {
            this.f1211 = i6;
            this.f1187 = -2.1474836E9f;
        }
        if (this.f1187 == -2.1474836E9f) {
            this.f1187 = getMeasuredWidth();
            getParent();
        }
        if (this.f1202 == Integer.MIN_VALUE) {
            if (this.f1214 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f1204;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f1214.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.f1202 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.f1215 == Integer.MIN_VALUE) {
            this.f1215 = getPaddingStart();
        }
        if (this.f1216 == Integer.MIN_VALUE) {
            this.f1216 = getPaddingEnd();
        }
        getParent();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5412)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5412 c5412 = (C5412) parcelable;
        super.onRestoreInstanceState(c5412.f17201);
        setChecked(c5412.f17866);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C5412 c5412 = new C5412(super.onSaveInstanceState());
        c5412.f17866 = this.f1206;
        return c5412;
    }

    @Override // p000.C2465, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m712(getMeasuredWidth(), getMeasuredHeight());
        m714(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.f1192.f3850) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean zPerformClick = super.performClick();
        if (z && !zPerformClick) {
            playSoundEffect(0);
        }
        return zPerformClick;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f1214 != null) {
            if (this.f1214.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1186 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m725()) {
            super.setBackgroundColor(i);
            return;
        }
        C1096 c1096 = this.f1192;
        if (c1096.m2321(false) != null) {
            c1096.m2321(false).setTint(i);
        }
    }

    @Override // p000.C2465, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m725()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C1096 c1096 = this.f1192;
        c1096.f3848 = true;
        C0324 c0324 = c1096.f3853;
        c0324.setSupportBackgroundTintList(c1096.f3855);
        c0324.setSupportBackgroundTintMode(c1096.f3860);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p000.C2465, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC4225.m7464(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m725()) {
            this.f1192.f3845 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.f1187 = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (m725()) {
            C1096 c1096 = this.f1192;
            if (c1096.f3849 && c1096.f3859 == i) {
                return;
            }
            c1096.f3859 = i;
            c1096.f3849 = true;
            c1096.f3851 = c1096.f3851.mo5484(i);
            c1096.m2322();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m725()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(C3312 c3312) {
        C1096 c1096 = this.f1192;
        c1096.f3844 = c3312;
        if (c1096.f3851 instanceof C2909) {
            c1096.m2322();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.f1189 = Math.min(i, this.f1202);
        m713();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m725()) {
            C3472 c3472M2321 = this.f1192.m2321(false);
            C4488 c4488 = c3472M2321.f11547;
            if (c4488.f14836 != f) {
                c4488.f14836 = f;
                c3472M2321.m6276();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f1214 != drawable) {
            this.f1187 = -2.1474836E9f;
            this.f1214 = drawable;
            m726(true);
            m712(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f1207 != i) {
            if (this.f1214 != null && this.f1196 != null && m717()) {
                C1078.m2272("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.f1207 = i;
                m712(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.f1193 != i) {
            this.f1193 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC4225.m7464(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            C1078.m2272("iconSize cannot be less than 0");
        } else if (this.f1204 != i) {
            this.f1187 = -2.1474836E9f;
            this.f1204 = i;
            m726(true);
            m709(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1212 != colorStateList) {
            this.f1212 = colorStateList;
            m726(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1194 != mode) {
            this.f1194 = mode;
            m726(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC4225.m7481(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C1096 c1096 = this.f1192;
        c1096.m2320(c1096.f3846, c1096.f3861, c1096.f3847, i);
    }

    public void setInsetLeft(int i) {
        C1096 c1096 = this.f1192;
        c1096.m2320(i, c1096.f3861, c1096.f3847, c1096.f3852);
    }

    public void setInsetRight(int i) {
        C1096 c1096 = this.f1192;
        c1096.m2320(c1096.f3846, c1096.f3861, i, c1096.f3852);
    }

    public void setInsetTop(int i) {
        C1096 c1096 = this.f1192;
        c1096.m2320(c1096.f3846, i, c1096.f3847, c1096.f3852);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.f1195 != z) {
            this.f1195 = z;
            C1096 c1096 = this.f1192;
            if (z) {
                C5322 c5322 = new C5322(7, this);
                c1096.f3854 = c5322;
                C3472 c3472M2321 = c1096.m2321(false);
                if (c3472M2321 != null) {
                    c3472M2321.f11534 = c5322;
                }
            } else {
                c1096.f3854 = null;
                C3472 c3472M2322 = c1096.m2321(false);
                if (c3472M2322 != null) {
                    c3472M2322.f11534 = null;
                }
            }
            post(new RunnableC0029(12, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m725()) {
            C1096 c1096 = this.f1192;
            C0324 c0324 = c1096.f3853;
            if (c1096.f3862 != colorStateList) {
                c1096.f3862 = colorStateList;
                if (c0324.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) c0324.getBackground()).setColor(AbstractC1087.m2296(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m725()) {
            setRippleColor(AbstractC4225.m7481(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.f1196 != drawable) {
            this.f1187 = -2.1474836E9f;
            this.f1196 = drawable;
            this.f1188 = false;
            m709(true);
            m714(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setSecondaryIconGravity(int i) {
        if (this.f1209 != i) {
            if (this.f1196 != null && this.f1214 != null && m717()) {
                C1078.m2272("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.f1209 = i;
                m714(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? AbstractC4225.m7464(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.f1210 != colorStateList) {
            this.f1210 = colorStateList;
            m709(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.f1199 != mode) {
            this.f1199 = mode;
            m709(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(AbstractC4225.m7481(getContext(), i));
    }

    public void setShapeAppearance(InterfaceC3388 interfaceC3388) {
        if (!m725()) {
            C1078.m2276("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        C1096 c1096 = this.f1192;
        if (c1096.f3844 == null && interfaceC3388.mo5485()) {
            c1096.f3844 = m708();
            if (c1096.f3851 instanceof C2909) {
                c1096.m2322();
            }
        }
        c1096.f3851 = interfaceC3388;
        c1096.m2322();
    }

    @Override // p000.InterfaceC3863
    public void setShapeAppearanceModel(C4040 c4040) {
        if (!m725()) {
            C1078.m2276("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        C1096 c1096 = this.f1192;
        c1096.f3851 = c4040;
        c1096.m2322();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m725()) {
            C1096 c1096 = this.f1192;
            c1096.f3864 = z;
            c1096.m2319();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m725()) {
            C1096 c1096 = this.f1192;
            if (c1096.f3856 != colorStateList) {
                c1096.f3856 = colorStateList;
                c1096.m2319();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m725()) {
            setStrokeColor(AbstractC4225.m7481(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m725()) {
            C1096 c1096 = this.f1192;
            if (c1096.f3857 != i) {
                c1096.f3857 = i;
                c1096.m2319();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m725()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p000.C2465
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m725()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C1096 c1096 = this.f1192;
        if (c1096.f3855 != colorStateList) {
            c1096.f3855 = colorStateList;
            if (c1096.m2321(false) != null) {
                c1096.m2321(false).setTintList(c1096.f3855);
            }
        }
    }

    @Override // p000.C2465
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m725()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C1096 c1096 = this.f1192;
        if (c1096.f3860 != mode) {
            c1096.f3860 = mode;
            if (c1096.m2321(false) == null || c1096.f3860 == null) {
                return;
            }
            c1096.m2321(false).setTintMode(c1096.f3860);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f1187 = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m712(getMeasuredWidth(), getMeasuredHeight());
        m714(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // p000.C2465, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.f1187 = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // p000.C2465, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.f1187 = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f1192.f3850 = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.f1187 = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(EnumC5059 enumC5059) {
        if (this.f1198 != enumC5059) {
            this.f1198 = enumC5059;
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.f1205 != i) {
            this.f1205 = i;
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1206);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final C3312 m708() {
        Context context = getContext();
        TypedValue typedValueM5253 = AbstractC2776.m5253(context.getTheme(), ru.bluecat.yandexmapspatcher.R.attr.motionSpringFastSpatial);
        int[] iArr = AbstractC0980.f3460;
        TypedArray typedArrayObtainStyledAttributes = typedValueM5253 == null ? context.obtainStyledAttributes(null, iArr, 0, ru.bluecat.yandexmapspatcher.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueM5253.resourceId, iArr);
        C3312 c3312 = new C3312();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            c3312.m6088(f);
            c3312.m6089(f2);
            typedArrayObtainStyledAttributes.recycle();
            return c3312;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m709(boolean z) {
        Drawable drawable = this.f1196;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1196 = drawableMutate;
            drawableMutate.setTintList(this.f1210);
            PorterDuff.Mode mode = this.f1199;
            if (mode != null) {
                this.f1196.setTintMode(mode);
            }
            int intrinsicWidth = this.f1204;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f1196.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f1204;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1196.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1196;
            int i = this.f1200;
            int i2 = this.f1208;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f1196.setVisible(true, z);
        }
        if (this.f1196 != null && this.f1214 != null && m717()) {
            C1078.m2272("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.f1196 == null) {
            if (this.f1188) {
                return;
            }
            if (this.f1214 != null && m717()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m719() && compoundDrawablesRelative[0] != this.f1196) || (m723() && compoundDrawablesRelative[2] != this.f1196) || (m720() && compoundDrawablesRelative[1] != this.f1196);
        if (z || z2) {
            if (m719()) {
                setCompoundDrawablesRelative(this.f1196, m724(1), m724(2), null);
            } else if (m723()) {
                setCompoundDrawablesRelative(m724(0), m724(1), this.f1196, null);
            } else if (m720()) {
                setCompoundDrawablesRelative(m724(0), this.f1196, m724(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final int m710(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.f1193) - getPaddingBottom()) / 2);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Drawable m711(int i) {
        if (i == 0) {
            if (this.f1196 == null || !m719()) {
                return null;
            }
            return this.f1196;
        }
        if (i == 1) {
            if (this.f1196 == null || !m720()) {
                return null;
            }
            return this.f1196;
        }
        if (i == 2 && this.f1196 != null && m723()) {
            return this.f1196;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m712(int i, int i2) {
        if (this.f1214 == null || getLayout() == null) {
            return;
        }
        if (m722() || m716()) {
            this.f1213 = 0;
            if (m715(this.f1207)) {
                this.f1190 = 0;
                m726(false);
                return;
            }
            int iM718 = m718(i, this.f1207);
            if (this.f1190 != iM718) {
                this.f1190 = iM718;
                m726(false);
                return;
            }
            return;
        }
        if (m721()) {
            this.f1190 = 0;
            if (this.f1207 == 16) {
                this.f1213 = 0;
                m726(false);
                return;
            }
            int intrinsicHeight = this.f1204;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1214.getIntrinsicHeight();
            }
            int iM710 = m710(i2, intrinsicHeight);
            if (this.f1213 != iM710) {
                this.f1213 = iM710;
                m726(false);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m713() {
        int i = (int) (this.f1201 - this.f1189);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.f1197;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.f1187 + i);
        }
        setPaddingRelative(this.f1215 + i3, getPaddingTop(), (this.f1216 + i) - i3, getPaddingBottom());
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final void m714(int i, int i2) {
        if (this.f1196 == null || getLayout() == null) {
            return;
        }
        if (m719() || m723()) {
            this.f1208 = 0;
            if (m715(this.f1209)) {
                this.f1200 = 0;
                m709(false);
                return;
            }
            int iM718 = m718(i, this.f1209);
            if (this.f1200 != iM718) {
                this.f1200 = iM718;
                m709(false);
                return;
            }
            return;
        }
        if (m720()) {
            this.f1200 = 0;
            if (this.f1209 == 16) {
                this.f1208 = 0;
                m709(false);
                return;
            }
            int intrinsicHeight = this.f1204;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1196.getIntrinsicHeight();
            }
            int iM710 = m710(i2, intrinsicHeight);
            if (this.f1208 != iM710) {
                this.f1208 = iM710;
                m709(false);
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m715(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean m716() {
        int i = this.f1207;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m717() {
        if (m722() && m719()) {
            return true;
        }
        if (m716() && m723()) {
            return true;
        }
        return m721() && m720();
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final int m718(int i, int i2) {
        int intrinsicWidth;
        int intrinsicWidth2;
        Drawable drawable = this.f1214;
        if (drawable != null) {
            intrinsicWidth = this.f1204;
            if (intrinsicWidth == 0) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth = 0;
        }
        Drawable drawable2 = this.f1196;
        if (drawable2 != null) {
            intrinsicWidth2 = this.f1204;
            if (intrinsicWidth2 == 0) {
                intrinsicWidth2 = drawable2.getIntrinsicWidth();
            }
        } else {
            intrinsicWidth2 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - intrinsicWidth2) - this.f1193) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m719() {
        int i = this.f1209;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean m720() {
        int i = this.f1209;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m721() {
        int i = this.f1207;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final boolean m722() {
        int i = this.f1207;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m723() {
        int i = this.f1209;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final Drawable m724(int i) {
        if (i == 0) {
            if (this.f1214 == null || !m722()) {
                return null;
            }
            return this.f1214;
        }
        if (i == 1) {
            if (this.f1214 == null || !m716()) {
                return null;
            }
            return this.f1214;
        }
        if (i == 2 && this.f1214 != null && m716()) {
            return this.f1214;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final boolean m725() {
        C1096 c1096 = this.f1192;
        return (c1096 == null || c1096.f3848) ? false : true;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m726(boolean z) {
        Drawable drawable = this.f1214;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f1214 = drawableMutate;
            drawableMutate.setTintList(this.f1212);
            PorterDuff.Mode mode = this.f1194;
            if (mode != null) {
                this.f1214.setTintMode(mode);
            }
            int intrinsicWidth = this.f1204;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f1214.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f1204;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f1214.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f1214;
            int i = this.f1190;
            int i2 = this.f1213;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.f1214.setVisible(true, z);
        }
        if (this.f1214 != null && this.f1196 != null && m717()) {
            C1078.m2272("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.f1214 == null && this.f1196 != null && m717()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m722() && compoundDrawablesRelative[0] != this.f1214) || (m716() && compoundDrawablesRelative[2] != this.f1214) || (m721() && compoundDrawablesRelative[1] != this.f1214);
        if (z || z2) {
            if (m722()) {
                setCompoundDrawablesRelative(this.f1214, m711(1), m711(2), null);
            } else if (m716()) {
                setCompoundDrawablesRelative(m711(0), m711(1), this.f1214, null);
            } else if (m721()) {
                setCompoundDrawablesRelative(m711(0), this.f1214, m711(2), null);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ void m727() {
        this.f1197 = getOpticalCenterShift();
        m713();
        invalidate();
    }

    public void setOnPressedChangeListenerInternal(InterfaceC1450 interfaceC1450) {
    }

    public void setSizeChange(AbstractC5283 abstractC5283) {
    }
}
