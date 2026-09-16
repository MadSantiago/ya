package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥُٕؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C1391 extends ListView {

    /* JADX INFO: renamed from: ۥؖ */
    public RunnableC3365 f4751;

    /* JADX INFO: renamed from: ۥَ */
    public int f4752;

    /* JADX INFO: renamed from: ۥْ */
    public int f4753;

    /* JADX INFO: renamed from: ۥٓ */
    public int f4754;

    /* JADX INFO: renamed from: ۥٖ */
    public int f4755;

    /* JADX INFO: renamed from: ۥٙ */
    public ViewOnTouchListenerC4081 f4756;

    /* JADX INFO: renamed from: ۥۖ */
    public final boolean f4757;

    /* JADX INFO: renamed from: ۦٕ */
    public boolean f4758;

    /* JADX INFO: renamed from: ۦٗ */
    public C3965 f4759;

    /* JADX INFO: renamed from: ۦۛ */
    public boolean f4760;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f4761;

    /* JADX INFO: renamed from: ۦۨ */
    public final Rect f4762;

    public C1391(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f4762 = new Rect();
        this.f4761 = 0;
        this.f4753 = 0;
        this.f4754 = 0;
        this.f4752 = 0;
        this.f4757 = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f4762;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f4751 != null) {
            return;
        }
        super.drawableStateChanged();
        C3965 c3965 = this.f4759;
        if (c3965 != null) {
            c3965.f13260 = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f4758 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f4757 || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f4757 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f4757 || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f4757 && this.f4760) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f4751 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f4751 == null) {
            RunnableC3365 runnableC3365 = new RunnableC3365(5, this);
            this.f4751 = runnableC3365;
            post(runnableC3365);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (Build.VERSION.SDK_INT < 30 || !AbstractC5425.f17908) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC5425.f17907.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC5425.f17906.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC5425.f17905.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f4758 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f4755 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC3365 runnableC3365 = this.f4751;
        if (runnableC3365 != null) {
            C1391 c1391 = (C1391) runnableC3365.f11241;
            c1391.f4751 = null;
            c1391.removeCallbacks(runnableC3365);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f4760 = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C3965 c3965 = null;
        if (drawable != null) {
            C3965 c3966 = new C3965();
            Drawable drawable2 = c3966.f13261;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c3966.f13261 = drawable;
            drawable.setCallback(c3966);
            c3966.f13260 = true;
            c3965 = c3966;
        }
        this.f4759 = c3965;
        super.setSelector(c3965);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f4761 = rect.left;
        this.f4753 = rect.top;
        this.f4754 = rect.right;
        this.f4752 = rect.bottom;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:83:0x015f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m2952(MotionEvent motionEvent, int i) {
        boolean z;
        boolean zM7737;
        View childAt;
        View childAt2;
        ViewOnTouchListenerC4081 viewOnTouchListenerC4081;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z = true;
            } else if (actionMasked != 3) {
                z = true;
                z2 = false;
            } else {
                z = false;
                z2 = false;
            }
            if (z || z2) {
                this.f4758 = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f4755 - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            viewOnTouchListenerC4081 = this.f4756;
            if (z) {
                if (viewOnTouchListenerC4081 == null) {
                    viewOnTouchListenerC4081 = new ViewOnTouchListenerC4081(this);
                    this.f4756 = viewOnTouchListenerC4081;
                }
                viewOnTouchListenerC4081.f13607 = true;
                viewOnTouchListenerC4081.onTouch(this, motionEvent);
            } else if (viewOnTouchListenerC4081 != null) {
                if (viewOnTouchListenerC4081.f13607) {
                    viewOnTouchListenerC4081.m7269();
                }
                viewOnTouchListenerC4081.f13607 = false;
            }
            return z;
        }
        z = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex < 0) {
            z = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f4758 = true;
                AbstractC1560.m3312(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.f4755;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f4755 = iPointToPosition;
                AbstractC1560.m3312(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f4762;
                rect.set(left, top, right, bottom);
                rect.left -= this.f4761;
                rect.top -= this.f4753;
                rect.right += this.f4754;
                rect.bottom += this.f4752;
                if (Build.VERSION.SDK_INT >= 33) {
                    zM7737 = AbstractC4450.m7737(this);
                } else {
                    Field field = AbstractC5881.f19412;
                    if (field != null) {
                        try {
                            zM7737 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                            zM7737 = false;
                        }
                    } else {
                        zM7737 = false;
                    }
                }
                if (childAt3.isEnabled() != zM7737) {
                    boolean z4 = !zM7737;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC4450.m7736(this, z4);
                    } else {
                        Field field2 = AbstractC5881.f19412;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z4));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z3) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                C3965 c3965 = this.f4759;
                if (c3965 != null) {
                    c3965.f13260 = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z2 = false;
                z = true;
            }
        }
        if (z) {
            this.f4758 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f4755 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f4758 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f4755 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        viewOnTouchListenerC4081 = this.f4756;
        if (z) {
            if (viewOnTouchListenerC4081 == null) {
                viewOnTouchListenerC4081 = new ViewOnTouchListenerC4081(this);
                this.f4756 = viewOnTouchListenerC4081;
            }
            viewOnTouchListenerC4081.f13607 = true;
            viewOnTouchListenerC4081.onTouch(this, motionEvent);
        } else if (viewOnTouchListenerC4081 != null) {
            if (viewOnTouchListenerC4081.f13607) {
                viewOnTouchListenerC4081.m7269();
            }
            viewOnTouchListenerC4081.f13607 = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m2953(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i5 = layoutParams.height;
            view.measure(i, i5 > 0 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return i2;
            }
        }
        return measuredHeight;
    }
}
